package d23OOPS;

//can create 'static' block & it executes just before we create objects
//Inside 'static method', we can only access 'static varaibales' & 'static methods'

public class StaticVariables_Methods {
	
	int length;
	int breadth;
	static int count;
	
	//constructor
	StaticVariables_Methods(){
		length = 2;
		breadth = 5;
		count++;
	}
	
	static{                                  //executes before 'Object' is created and execute only one time
		System.out.println("From the static block");
		//count=1;    //can initialize 'static' variable here if needed
	}
	
	public static void main(String[] args) {
		System.out.println("Before creating object");
		
		StaticVariables_Methods obj1 = new StaticVariables_Methods();
		StaticVariables_Methods obj2 = new StaticVariables_Methods();
		
		System.out.println("After creating object");
		System.out.println(obj1.length * obj2.breadth);
		
		System.out.println(count);

	}

}
