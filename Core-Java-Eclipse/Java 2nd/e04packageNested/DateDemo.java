package e04packageNested;

import java.lang.Math;

//import static java.lang.Math.*;   //static import -> No need to mention class. Can directly use method name

public class DateDemo {

	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();	//can also use like this without import at the start
		
		
		//Nested Package -> Just for our understanding. Compiler treats every package as different eventhough
		//it is nested.
		
		System.out.println(Math.sqrt(4));   //No need to create 'Object' to use 'sqrt' method as it is static()

		//For Static import
		//System.out.println(sqrt(9));		//directly call method without mentioning 'Class' name
	}

}
