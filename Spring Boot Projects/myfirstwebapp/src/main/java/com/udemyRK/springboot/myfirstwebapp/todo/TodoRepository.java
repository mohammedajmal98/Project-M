package com.udemyRK.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	//<What bean it is managing, Type of the primary id>
	
	
	//If we call getById, we can directly use anywhere. But if we call 
	//by any other field in entity, we need to create custom method here
//Custom Method Structure -> findBy[any field name in entity in 1st letter caps](pass the datatype of the field)
	public List<Todo> findByUsername(String username);
}
