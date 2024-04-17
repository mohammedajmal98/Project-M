package oops;

class A {
	int a;
	
	public void show() {
		System.out.println("in A");
	}
}

public class Inheritance extends A {
	
	@Override
	public void show() {
		System.out.println("in inheritance");
	}
	
	public void play() {
		System.out.println("in play");
	}

	public static void main(String[] args) {
		
//		A a = new A();
//		a.show();
		
		A a = new Inheritance();  // A- reference, a is the object of Inheritance
		a.show();  // print 'show' method of Inheritance not A
		
//		a.play();    //can't print this method bcoz 'play' method doesn't inside class A (reference)
		
		int b = 2;
		System.out.println(b+2);

	}

}
