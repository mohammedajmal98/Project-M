package oops;

class Y {
	
	final String abc = "Hello";
	final int i;
	
	
	Y() {
		i=10;    //final value only assigned near datatype (or) in the constructor
	}

	public void show() {               //mark method as "final", if we don't want our method to "override"
		System.out.println("I'm from Y");
	}
	
	public void play() {
		System.out.println("I'm from play");
	}
	
}

final class Demo extends Y {    //mark class as "final" if we don't our class to be extended
	int i = 3;

	public void show() {
		System.out.println("I'm from Demo");
	}
}



public class Final {

	public static void main(String[] args) {

		Y dem = new Demo();
		dem.show();
		System.out.println(dem.i); // For method, it prints from "Demo" class.
									// For variable, it prints from "Y" class
		dem.play();
	}

}
