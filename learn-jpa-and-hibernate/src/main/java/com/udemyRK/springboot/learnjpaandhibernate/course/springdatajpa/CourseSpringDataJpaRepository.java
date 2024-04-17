package com.udemyRK.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyRK.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository 
				extends JpaRepository<Course, Long> //Course & Id type
{
	
	//Can have some custom methods too.
	//But need to follow some naming Convention
	
	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);

}
