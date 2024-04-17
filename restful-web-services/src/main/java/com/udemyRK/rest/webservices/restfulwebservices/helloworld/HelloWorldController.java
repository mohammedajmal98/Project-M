package com.udemyRK.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world") //use 'path' or 'value'
	public String helloWorld() {
		return "Hello World Makkale";
	}
	
	//Return 'Bean' (JSON response coming for this below code as {"message": "Hello World"})
	@GetMapping(path="/hello-world-bean") 
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Makkaa");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}") 
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello " + name);
	}

}
