package com.udemyRK.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	
	private UserDAOService service;
	//Constructor Injection
	public UserResource(UserDAOService service) {
		this.service = service;
	}
	
	
	//GET users
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	//GET user by ID
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		User user = service.findById(id);
		if(user==null) {
			throw new UserNotFoundException("id:"+id);	
		}
		return user;
	}
	
	//DELETE user by ID
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		service.deleteById(id);
	}
	
	
	//POST user & also use 'ResponseEntity' class to return 
	//appropriate Response Status with URI for users to access their saved data
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
							.path("/{id}") 
	//Appending variable to the current request and replacing it to the value
							.buildAndExpand(savedUser.getId())//
							.toUri();
		//location - URI
		return ResponseEntity.created(location).build(); 
		//Now we get '201' response status and URI for the created id when try to 
		//POST request through Talend API or Postman
	}
	
	

}
