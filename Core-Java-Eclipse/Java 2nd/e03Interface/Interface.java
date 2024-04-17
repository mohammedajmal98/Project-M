package e03Interface;

//Abstract classes can have "Constructors" but Interfaces can't have Constructors

interface Vehicle {
	int speed = 90; //public, static and final by default. won't allow instance(non-static) variables
	
	void ride();  // public and abstract by default
	//must implement all the abstract methods in the child 'Classes' which implements this interface 
	//but in 'Abstract class", we don't need to implement methods
	
	//Default Method & Static Method is the new Feature from Java 8 & default method can be overridden but 
	//static method can't be overridden in Implemented classes
	default void test(){
		System.out.println("From Vehicle Interface Default Method");
	}
	static void staticTest(){	//can't be overridden & called by using Class reference
		System.out.println("From Static Method in Parent Interface");
	}
}

abstract class Lorry implements Vehicle {
	//Here, no need to implement methods in Parent Interface as it is an "abstract" class. But normal class
	//need to implement all the methods present.
}

class Bike implements Vehicle {
	public void ride(){
		System.out.println("Riding my Bike");   //must implement all the abstract methods in parent interface
	}
}

class Car implements Vehicle {
	public void ride(){
		System.out.println("Riding my Car");
	}
	public void test(){
		System.out.println("From Car Class test method");
	}
}

class Mechanic {
	void check(Vehicle v) { 				//receiving object using 'Vehicle' interface as reference
		System.out.println("Checking....");
		v.ride();
	}
}

public class Interface {
	public static void main(String[] args) {
		Mechanic m = new Mechanic();
		Car c = new Car();
		Bike b = new Bike();
		
		// Vehicle v = new Vehicle(); //Can't create a 'Vehicle' object as it is an interface.
		
		Vehicle v = new Car(); //But, can be used as 'Reference'
		m.check(c);
		m.check(b);
		
		c.test();
		v.test();
		
		Vehicle.staticTest();
		
	}
}

/* Interface : Only allows method declaration not method definition/implementation. But from Java 1.8, we can 
 * define methods in interface. 
 * 			But, we must give 'default' in method definition in Interface. Also, it can be overridden in 
 * 		implemented class.
 * 
 * Can't create 'Objects' for Interface. So, No constructors for it.
 * 
 * An Interface can extend one/many interfaces.
 * A class can implement one/many interfaces.
 * 
 * 
 * 
 * 
 * Abstract Class vs Interface
 * 
 * 	Multiple Inheritance: Use 'Interface' to achieve this. Then only we can implement many methods for the single
 * class
 * 
 *  Different Methods : Use 'Abstract Class' to use both abstract as well as normal methods in the Class.
 */

















