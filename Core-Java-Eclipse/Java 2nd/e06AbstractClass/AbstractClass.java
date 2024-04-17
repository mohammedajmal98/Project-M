package e06AbstractClass;

/*				Abstract vs Concrete
 * 
 * Concrete : Refers to physical object in real world. (Still now, we created concrete classes)
 * Abstract : Idea or Concept that does not exist physically in real world
 * 
 * Eg: If a college has a Website, there are users from Students, Teachers and Office Staffs.
 * 	   For all of them, some needs common functionality, some needs different Functions.
 * 		Common data/functions for all -> in Base class (Parent Class) eg: User Class
 * 		Individual unique data/functions -> in their own class/derived class/child class eg: Student class, Staff Class
 * 
 * If u need to build "abstract" method in a class, u need to change that class as "abstract". But we can use
 * normal concrete method in abstract class
 * 
 * Abstract class cannot be used to create "Objects" but can be used as "Reference"
 * 
 */

abstract class User{
	private String name;
	abstract void welcomeMessage();  //As we need this method to be unique for different users, we mark it as "abstract"	
	//Abstract Method
	
	public String getName(){         //Concrete Method
		return name;
	}
}

class Student extends User {  //It must implement all methods of "Abstract" class
	void welcomeMessage(){
		System.out.println("Hi Student...");
	}
}
class Teacher extends User{
	void welcomeMessage(){
		System.out.println("Hi Teacher...");
	}
}
class Staff extends User{
	void welcomeMessage(){
		System.out.println("Hi Staff...");
	}
}

abstract class Guest extends User{
	//Here no need to implement the "Abstract" Methods as it is already an "Abstract" Class
	//But, if any normal class extends this "Guest Class", they must implement all Abstract Methods present in
	//both "User" class and "Guest" Class.
}

public class AbstractClass {
	public static void main(String[] args) {
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		// User u1 = new User(); 	//not allowed as 'User' is abstract class
		User u1 = new Student(); //allowed
		
		User[] user = new User[3];
		user[0] = new Student();
		user[1] = new Teacher();
		user[2] = new Staff();
		
		for(User u : user){
			u.welcomeMessage();
		}
	}
}
