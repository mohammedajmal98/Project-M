package oops;

class One {
	int i;
	public void show() {
		System.out.println("from One" + " " + i);
	}
}

class Two extends One{
	int i;
	
	@Override
	public void show() {
		super.i=8;
		i=4;
		super.show();
		System.out.println("from Two" + " " + super.i + " " + i);
	}
	
	public void play() {
		System.out.println("from play");
	}
}

class Three extends One {
	public void show() {
		System.out.println("from Three");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		
		Two obj1 = new Two();
		obj1.show();     // it prints show() from class "Two". To print show() from class "One" also, use super()

		One obj2 = new Two();
		obj2.show();        // it also prints show() from "Two" even reference is "One".
		
//		obj2.play(); //But if we try to print class "Two" method which is not present in class "One", then it shows an error
	
		obj2 = new Three();   //Now obj2 is the object of class "Three"
		obj2.show();    // This is called "Dynamic Method Dispatch"
		
	}
}



	

