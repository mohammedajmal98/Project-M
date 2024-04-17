package oops;

abstract class Human {
	void walk(){
		System.out.println("Walking");
	}
	abstract void jog();    //class which extends Human class must define abstract methods in this class
}

class Men extends Human {    // Men is a "Concrete class" bcoz it extends abstract class
	void run() {
		System.out.println("Running");
	}
	void jog(){
		System.out.println("Jogging");
	}
}


public class AbstractKey {

	public static void main(String[] args) {
		
		Human act = new Men();  //can use reference of abstract class but can't create an object
		act.walk();
		act.jog();

	}

}
