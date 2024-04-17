package com.udemyRK.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses
//Output: Course: id, name, author

@RestController //@Controller + @ResponseBody
public class courseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1,"Learn AWS", "in38minutes"),
				new Course(2,"Learn DevOps", "in38minutes"),
				new Course(3,"Learn BlockChain", "in38minutes")
				);
		//All values are returned in JSON Format using JSON converter
	}
}
