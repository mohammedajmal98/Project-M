package oops;

class A1 {
	public A1() {
		System.out.println("in A");
	}
	
	public A1(int x) {
		System.out.println("in A int");
	}
}

class B extends A1{
	public B() {
//		super(); // implicitly added here
		
		super(2); //override super method to print parameterized constructor of A
		System.out.println("in B");
	}
	
	public B(int x) {
//		super(); //implicitly added here
		
		super(x);
		System.out.println("in B int");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		
		B obj1 = new B();

	}

}
