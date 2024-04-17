// For implementing/overrridng purpose only if we need a class from the base class to the 
// derived class, we can use "Anonymous Class" rather than creating a separate class

//Anonymous Class is created during an Object creation followed by Method Overriding
// Useful for One-time purpose only

abstract class Cycle {
	void model(){
		System.out.println("Default Model");
	}
	void year(){
		System.out.println("Default: 2020");
	}
	abstract void gender();
}

public class F14AnonymousClass {

	public static void main(String[] args) {
		Cycle c = new Cycle(){	//Creating Anonymous Class by overriding all the abstract methods and needed
			//normal methods of the class
			void model(){
				System.out.println("Hercules Model");	
			}
			void gender(){
				System.out.println("Male");
			}
		};
		
		c.model();		//Overridden
		c.year();		//Not Overridden
		c.gender();		//overridden - must to create Anonymous Class

	}
}
