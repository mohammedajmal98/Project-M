package com.udemyRK.springboot.learnspringboot;

public class Course {
	
	private long id;
	private String name;
	private String author;
	
	
	// need to create Constructors, Getters and toString()
	
	//Getter methods help us to retrieve the values in the "Webpage Result"
	//of a course whenever we need them (Here, no need of toString() implementation)
	//Whatever get() method is there, all values will be retrieved in webpage
	//Field name of the value = method name (after get_ _ _)
	
	
	//toString() - used to print the values in the console whenever
	//we call the object here (Here, no need of "Getter Methods")
	
	//Constructor is needed for both to initialize the values
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	//It just prints in the Webpage with the same value AK for every course
	public String getUniqueName() {
		return "AK";
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


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
