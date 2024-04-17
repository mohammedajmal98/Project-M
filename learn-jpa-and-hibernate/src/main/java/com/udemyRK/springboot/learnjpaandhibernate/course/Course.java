package com.udemyRK.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//maps all fields (beans) to the database table

//Since Class name matches with table name, no need of mentioning it

@Entity //(name="Course_Details")
public class Course {
	
	@Id //defining this below field as a primary key
	private long id;
	
	//name = name of the column in the database table (to map)
	//Since all field/bean name matches with column name, no need
//	@Column(name="name") 
	private String name;
	
//	@Column(name="author")
	private String author;
	
	//Constructors, Getters, toString
	
	//No-arg constructor
	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
