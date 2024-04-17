
public class F007_OuterClass_with_InnerClass {
	
	int number = 6;
	
	public void heyThere(){
		System.out.println("Hey there!!!");
	}
	
	//Type -1 -> Non-static inner class
	public class InnerClass{
		int innerNumber = 10;
		
		public void whatsup(){
			System.out.println("What's Up from the inner class!!!");
		}
	}
	
	//Type - 2 -> Static inner class
	public static class StaticInnerClass{
		int staticInnerNumber = 99;
		
		public void whatsup(){
			System.out.println("What's Up from the static inner class!!!");
		}	
	}
	
	//Type 3 - Local Inner Class inside a method (to use it immediately)
	public void localInnerClass(){
		String id = "89";
		class LocalInner{
			String name = "Khan";
			public void localCheck(){
				System.out.println("Method from Local Inner Class" + " " + id);
			}	
		}
		LocalInner loc = new LocalInner();
		loc.localCheck();
		System.out.println(loc.name);
	}
	
/*It is a type of inner class which
1) has no name
2) can be instantiated only once
3) is usually declared inside a method or a code block ,a curly braces ending with semicolon.
4) is accessible only at the point where it is defined.
5) does not have a constructor simply because it does not have a name
6) cannot be static
*/
	
	//Type 4 - Anonymous Inner Class
//	Pizza pizza = new Pizza(){
//		public void eat(){
//			System.out.println("Anonymous Pizza");
//		}
//	};

}

class Pizza{
	public void eat(){
		System.out.println("pizza");
	}
}
