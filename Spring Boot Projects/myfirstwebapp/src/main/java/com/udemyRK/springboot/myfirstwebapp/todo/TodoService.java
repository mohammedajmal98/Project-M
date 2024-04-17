package com.udemyRK.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	//If we want to initialize a static variable, we need to 
	//create a static block
	static {
		//static list of todos instead of storing in database
		todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS CP", 
						LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps", 
						LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn Full Stack Dev", 
						LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}

	public void addTodo(String username, String description, 
								LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description,
										targetDate, done);
		todos.add(todo);	
	}	
	
	public void deleteById(int id) {
		// todo -> todo.getId() == id --> Lambda Function
		//Predicate -> we define condition when to remove todo
		//Check every todo present from the list of todos -> Every bean in the todos executes this condition
		Predicate<Todo> predicate = todo -> todo.getId()==id;
		//Every bean checks 'ID' matches with its 'ID'.
		//If condition matches, it removes that specific todo
		
//Example: If I have 10 todos in the list, it will check the 'ID' of each of these todos against these condition. If condition matches, it would remove that specific todo                                   
		todos.removeIf(predicate);  
	
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId()==id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		//findFirst() is used to get only first bean which matches specific id (if 'id' matches with many todos(beans) in the list)
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId()); //deleting the existing value and add new
		todos.add(todo);
		//Easier way of updating but not the most efficient way
	}
	
	
	
}
