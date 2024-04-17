package interfaces;

interface A {
	int i = 10;
	default void show(){
		System.out.println("from A");
	}
}

interface B {
	default void show(){
		System.out.println("from B");
	}
}

class C implements A,B { 
	
	int i = 15;
	//we need to override show method through our own implementation
	// or using (className).super.show();   
	public void show(){
		//System.out.println("from C");       
		//A.super.show();
		B.super.show();
	}
}

public class EMultipleInheritanceAmbiguity {

	public static void main(String[] args) {
		
		C obj1 = new C();   // if use "A" reference, i=10 will be printed. if use "C" reference, i=15 will be printed
		obj1.show();
		
		System.out.println(obj1.i);
		
		System.out.println(A.i); //bcoz of static, directly access using class name

	}

}
