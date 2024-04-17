class Outer {
	int i = 2;
	static double d = 3.5;
	
	static class Inner {   // File name be like: Outer$Inner.class (also use static class Inner)
		
		int i = 5;
		public void perform() {
			System.out.println("I'm from Inner class");
		}	
	}		
}

public class InnerClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		System.out.println(out.d); // also use object to call static variable
		System.out.println(Outer.d); // directly use class name bcoz of static
		
		//To access inner class which is static	
		Outer.Inner inn = new Outer.Inner();
		inn.perform();
		System.out.println(inn.i);
		System.out.println(out.i);
		
		
		// To access inner class which is non-static, use object of outer class (but reference Outer.Inner is same)
//		Outer.Inner inn2 = out.new Inner();
//		inn2.perform();
//		System.out.println(inn2.i + 5);
//		System.out.println(out.i);
		
	}
}
