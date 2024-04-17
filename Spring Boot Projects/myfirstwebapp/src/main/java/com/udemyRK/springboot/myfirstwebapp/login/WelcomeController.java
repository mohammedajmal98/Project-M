package com.udemyRK.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") 
//name value is retained across certain requests -> This “name” value 
//should be in the same name as what we put in ModelMap model

public class WelcomeController { //Formerly "LoginController"
	
	//Can delete "AuthenticationService" and "login.jsp" as Spring Security takes care of authentication
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		//Getting the username value from Spring Security and store it in model
		return "welcome";
	}
	
	//To get 'Username" from Spring Security instead of Hardcoding
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	//@Autowired	//Field Injection
//	private AuthenticationService authenticationService;
//	//To intialize this, use Constructor Injection or Field Injection
//	
//	//Constructor Injection for dependencies
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}
//	
//		
//	//same url but, now it only supports GET method
//	@RequestMapping(value="login", method=RequestMethod.GET)
//	public String gotoLoginPage() {
//		return "login";
//	}
//	
//
//	//same url but, now it only supports POST method when click 'Submit'
//	//Capturing the 'Form' data which is filled by the user using @RequestParam 
//	//and put it into the ModelMap model and reuse it in JSP to show view
//	//check inspect->network->doc->form
//	@RequestMapping(value="login", method=RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, 
//			@RequestParam String password, ModelMap model) {
//
//		//Authenticate 'name' and 'password'
//		if(authenticationService.authenticate(name, password)) {
//			//model.put("password", password);
//			model.put("name", name);
//			return "welcome";
//		}
//		
//		//Error message using <pre> preformatted tag in html
//		model.put("error", "Invalid Credentials! Please try again");
//		
//		return "login";
//	}
//	
//	
	
	
//	
//	//ModelMap - useful to map request param to login.jsp
//	//Add to the 'model' whenever we want anything to be available to our JSP
//	
//	//http://localhost:8080/login?name=AK //@RequestParam
//	@RequestMapping("login") 
//	public String gotoLoginPage(@RequestParam String naam, ModelMap model) {
//		
//		model.put("name", naam); 
//	//naam is used in request link eg: /login?naam=AK
//	//"name" is the name of request param which should be used in JSP
//	//Using "Expression Language" eg:${name}, we can use model values in JSP
//		
//		
//		//Sysout not recommended (use "Logger" instead)
			//for production code - just writing it 
//		//to print the request param input from the user to console
//		System.out.println("Request Param is " + naam); //not recommended
//		return "login";
//	}
}
