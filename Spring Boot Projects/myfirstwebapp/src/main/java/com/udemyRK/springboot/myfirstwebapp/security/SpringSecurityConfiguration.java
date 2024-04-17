package com.udemyRK.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration //would contain configuration of no of Spring beans
public class SpringSecurityConfiguration {
	//Typically we use LDAP or Database to store Usernames and passwords
	//To make it simple, here we use "In Memory"
	
	//InMemoryUserDetailsManager(UserDetails... users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails userDetails1 = createNewUser("Ajmal", "dummy");
		UserDetails userDetails2 = createNewUser("ak", "pk");

		return new InMemoryUserDetailsManager(userDetails1, userDetails2);	
	}//InMemoryUserDetailsManager(UserDetails... users)

	private UserDetails createNewUser(String username, String password) {
		//Lambda Function which accepts String as 'Input' and String as 'Output'
		Function<String, String> passwordEncoderUsingBCrypt
					= input -> passwordEncoder().encode(input) ;
		//UserDetails is an Interface
		
		
		UserDetails userDetails = 
				// User.withDefaultPasswordEncoder()	
				User.builder().passwordEncoder(passwordEncoderUsingBCrypt)
				.username(username)
				.password(password)
				.roles("USER","ADMIN")
				.build();
		return userDetails;
	}
	
	//For Custom Password Encoder as Default Password Encoder is deprecated
	//BCryptPasswordEncoder is the implementation of PasswordEncoder
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	//Now, Spring starts this BCryptPassword encoder instead of default encoder
	
	
	//All URLs are protected
	//A login form is shown for unauthorized requests
	
	//Two things need to do:
	//1)CSRF disable - Cross-Site Request Forgery (CSRF)
	//2)Frames enabling by disabling X-Frames disabled for headers
	
	//When we override SecurityFilterChain, we need to define entire chain again!
	//That's why we repeat the first 2 steps
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests( // Set authentication first for any web requests
				auth -> auth.anyRequest().authenticated()); 
		http.formLogin(withDefaults()); //to show login form
		
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		//If X-Frame Options enabled-> Frames cannot be used
		//But, H2 Console uses Frames (So, disabled)
		
		return http.build();
	}
	
	
	
	
	
	
	
	
	
}
