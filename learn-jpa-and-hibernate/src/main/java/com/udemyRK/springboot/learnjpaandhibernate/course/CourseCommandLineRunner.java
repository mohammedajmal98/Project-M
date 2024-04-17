package com.udemyRK.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemyRK.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	//This run method will be executed at the startup of application
	@Override
	public void run(String... args) throws Exception {
		//repository.insert();
//		repository.insert(new Course(1,"LearnAWS now","In38Minutes"));
//		repository.insert(new Course(2,"Learn Java","In38Minutes"));
//		repository.insert(new Course(3,"Learn Boot","In38Minutes"));
		
		repository.save(new Course(1,"LearnAWS now","In38Minutes"));
		repository.save(new Course(2,"Learn Java","In38Minutes"));
		repository.save(new Course(3,"Learn Boot","In38Minutes"));
		
		//repository.deleteById(1);
		
		repository.deleteById(1l); //As it expects 'long'
		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		
		//Custom method to find by Author name
		System.out.println(repository.findByAuthor("In38Minutes"));
		System.out.println(repository.findByName("Learn Boot"));
		
		
		
	}
	
}
