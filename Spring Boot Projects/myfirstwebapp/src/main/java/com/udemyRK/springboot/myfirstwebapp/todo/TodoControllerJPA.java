package com.udemyRK.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name") 
//name value is retained across certain requests -> This “name” value 
//should be in the same name as what we put in ModelMap model
public class TodoControllerJPA {
	
	private TodoRepository todoRepository;
	
	//Constructor Injection
	public TodoControllerJPA(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		String username = getLoggedInUsername(model);
		//make use of Custom method of TodoRepository/JPARepository
		List<Todo> todos = todoRepository.findByUsername(username);
		
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	
	//handles GET method for "add-todo"
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = getLoggedInUsername(model);
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo); 
		//"todo" should be same as modelAttribute name in JSP
		return "todo";
	}
	
	
	//Using 'Command Bean'(Form Backing Object) instead of @RequestParam
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	//Directly binds to the Todo Bean
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		//@Valid insists the incoming values should undergone Validations set by us for every field
		
		//It checks any error is there in binding with validation
		if(result.hasErrors()) {
			return "todo";
		}
		
		String username = getLoggedInUsername(model);
		todo.setUsername(username);
		todoRepository.save(todo); 
		//It will automatically get all the values of that particular todo using get() in Todo

		//		todoService.addTodo(username, todo.getDescription(), 
//				todo.getTargetDate(), todo.isDone());
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoRepository.deleteById(id);
		//todoService.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoRepository.findById(id).get();
		model.addAttribute("todo", todo); 
		//"todo" should be same as modelAttribute name in todo.jsp
		return "todo"; 
	}
	
	
	@RequestMapping(value="update-todo", method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getLoggedInUsername(model);
		todo.setUsername(username); //this is not an issue to pass "todo" in the next line
		
		todoRepository.save(todo);
		//todoService.updateTodo(todo);
		return "redirect:list-todos";
	}
	
	//To get 'Username" from Spring Security instead of Hardcoding
	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
	
	
			
				
				
	
	//handles  POST method for "add-todo"
//	@RequestMapping(value="add-todo", method=RequestMethod.POST)
//	public String addNewTodo(@RequestParam String description, 
//			ModelMap model) {
//			
//		String username = (String)model.get("name");
//		todoService.addTodo(username, description, 
//				LocalDate.now().plusYears(1), false);
//		
//		//Instead of duplicating the List populating code here, 
//		//we just use 'redirect'
//		return "redirect:list-todos"; //"list-todos" is the link name
//	}

}
