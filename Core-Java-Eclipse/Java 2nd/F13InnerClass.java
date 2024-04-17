//Inner Class - The purpose of nested classes is to group classes that belong together, which makes your code 
//more readable and maintainable

class Outer {
	int x = 10;
	void outerMethod(){
		System.out.println("From Outer class");
	}
	
	class Inner{	//Inner class have access to the members of the outer class
		void innerMethod(){
			System.out.println("From Inner Class" + " " + x);
		}
	}
	static class StaticInner{ //Static Inner Class doesn't have access to members of the outer class
		void staticInnerMethod(){
			System.out.println("From Static Inner Class");
		}
	}
	private static class PrivateInner{ //Not visible to the Outer class, so it generates error when creating Obj
		void privateInner(){
			System.out.println("From Private Inner Class");
		}
	}
}


public class F13InnerClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		//Inner Class
		Outer.Inner in = out.new Inner();	//Creating Object for "Inner" class
		in.innerMethod();
		
		//Static Inner Class - No need to create an Object of the outer class to access Inner Class
		Outer.StaticInner staticIn = new Outer.StaticInner();	//Creating Object for "StaticInner" class
		staticIn.staticInnerMethod();
		
		
		
		
	}

}
