package com.udemyRK.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//id, username, description, targetDate, done

//JPA allows us to map our bean to a database table by using @Entity
@Entity	//(name="TodoTable") we can change our custom name for the table as well as columns
public class Todo {
	
	@Id
	@GeneratedValue //To generate value in a sequence
	private int id;
	
	//@Column(name="name")
	private String username;
	
	@Size(min=10, message="Enter atleast 10 characters, bro")
	private String description;
	
	private LocalDate targetDate; //This column name saved as TARGET_DATE in H2 Database
	private boolean done;
	
	//Default Constructor for Entity 'Todo'
	public Todo() {
	}
	
	public Todo(int id, String username, String description, 
						LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}
	
	
	
	

}
