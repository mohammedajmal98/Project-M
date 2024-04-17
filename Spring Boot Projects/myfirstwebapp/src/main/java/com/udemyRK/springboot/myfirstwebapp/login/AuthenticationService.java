package com.udemyRK.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("AK");
		boolean isValidPassword = password.equalsIgnoreCase("pk");
		
		return isValidUsername && isValidPassword;
	}
}
