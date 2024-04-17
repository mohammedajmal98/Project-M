package com.udemyRK.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component //(to make spring manage this class)
public class UserDAOService {
	
	//static list
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount, "AK", LocalDate.now().minusYears(25)));
	}
	
	//Method to retrieve all users
	public List<User> findAll(){
		return users;
	}
	
	//Method to retrieve user details by ID
	public User findById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		User filter = users.stream().filter(predicate).findFirst().orElse(null);
		//orElse(null) -> to avoid exception when GET ids which is not present
		return filter;
	}
	
	//Method to delete user details by ID
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
	
	//Method to save/add new User
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	
	
	
	
	
	
	
	
	

}
