package com.udemyRK.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udemyRK.springboot.learnjpaandhibernate.course.Course;

@Repository // when a class talks to a database, it uses this @
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate; //Class which uses for JDBC in Spring

	// Three double quotes called as Text block where we write our
	// SQL Query
	private static String INSERT_QUERY = 
//			"""
//			insert into course (id,name,author) 
//			values(1,'Learn AWS','in38Minutes');
//			""";
			"""
			insert into course (id,name,author) 
			values(?,?,?);
			""";
	
	private static String DELETE_QUERY =
			"""
			delete from course 
			where id=?
			""";
	
	private static String SELECT_QUERY =
			"""
			select * from course where id=?
			""";

	public void insert(Course course) {
		//update method is used to insert, delete, update queries
		//in Spring Data JDBC
		//springJdbcTemplate.update(INSERT_QUERY); with no parameters
		springJdbcTemplate.update(INSERT_QUERY, 
			course.getId(), course.getName(), course.getAuthor()); 
		//maintains the same order
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		//ResultSet (should map to Course bean) -> Bean => Row Mappers 
		//id is the input
		return springJdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);	
	}
}
