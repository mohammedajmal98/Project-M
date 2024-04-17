//Inner Class - also called as "Nested Class"
//Inner class are defined inside the body of another class (known as outer class). These classes 
//can have access modifier or even can be marked as abstract and final. Inner classes have special 
//relationship with outer class instances. This relationship allows them to have access to outer 
//class members including private members too.
/*1) Inner class
  2) Method – local inner class
  3) Anonymous inner class - class with no name & it is used to instantiate only one object ever of unnamed sub class not Main class(like Pizza or Runnable)
  4) Static nested class
*/

public class F007_Inner_Class {

	public static void main(String[] args) {
		
		F007_OuterClass_with_InnerClass outer = new F007_OuterClass_with_InnerClass();
		outer.heyThere();
		
		//Type 1 - Object creation for non-static inner class
		F007_OuterClass_with_InnerClass.InnerClass inner = outer.new InnerClass();
//F007_OuterClass_with_InnerClass.InnerClass inner = new F007_OuterClass_with_InnerClass().new InnerClass();
		inner.whatsup();
		// outer.whatsup(); wont work
		
		//Type 2 - Object creation for static inner class -> For Static, we don't need the instance of 
		//the outer class
		F007_OuterClass_with_InnerClass.StaticInnerClass staticInner = 
										new F007_OuterClass_with_InnerClass.StaticInnerClass();
		staticInner.whatsup();
		
		//Type 3 - Local Inner Class inside Method
		outer.localInnerClass();
		
		//Type 4 - Anonymous Inner Class - one time use class (only one object can be created)
		Pizza pizza = new Pizza(){
			@Override
			public void eat(){
				System.out.println("Anonymous Pizza");
			}
		};
		pizza.eat();
		
		//Type 4 - Anonymous Inner Class by implementing Interface using inner class
		Runnable anonymousRunnable = new Runnable(){
			@Override
			public void run() {
				System.out.println("Anonymous Runnable!!");
			}
			
		};
		anonymousRunnable.run();
	}

}
