package com.udemyRK.springboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//combination of 3 Annotations -> @SpringBootConfiguration +
//		@EnableAutoConfiguration + @ComponentScan
@SpringBootApplication 
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
		
//		var context = new AnnotationConfigApplicationContext
//				(LearnSpringBootApplication.class);
//		System.out.println(context.getBean(courseController.class)
//							.retrieveAllCourse());
	}

}
