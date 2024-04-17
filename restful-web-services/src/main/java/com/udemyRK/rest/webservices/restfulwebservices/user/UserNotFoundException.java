package com.udemyRK.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message) {
		super(message); 
		//message passing to Superclass (Runtime Exception) to display
		//id, otherwise it shows 'No message is available'
	}

}
