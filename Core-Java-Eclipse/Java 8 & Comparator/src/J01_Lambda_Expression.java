import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Lambda Expression - An anonymous function that does not have a name and doesn't belong to any Class

//Syntax: (parameter_list) -> {function_body}
/*
A method (or function) in Java has these main parts:
1. Name
2. Parameter list
3. Body
4. return type.

A lambda expression in Java has these main parts:
Lambda expression only has body and parameter list.
1. No name – function is anonymous so we don’t care about the name
2. Parameter list
3. Body – This is the main part of the function.
4. No return type – The java 8 compiler is able to infer the return type by checking the code. 
   you need not to mention it explicitly.

To use Lambda expression, you need to either create your own functional interface or use the 
pre defined functional interface provided by Java.

To use functional interface:

Pre Java 8: We create anonymous inner classes to implement methods of (Functional) Interfaces
	 b.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
    	     System.out.println("Hello World!"); 
          }  
       });
       
Post Java 8: You can use lambda expression instead of anonymous inner classes.
	 b.addActionListener(e -> System.out.println("Hello World!")); 
*/
@FunctionalInterface
interface MyFunctionalInterface{
	//A method with no parameter
	//public String sayHello();
	
	//A method with a single parameter
	//public int addFive(int x);
	
	//A method with multiple parameters
	public void concatStrings(String x, String y);
	
	//Below method if for sample purpose
	public default void hello(){
		System.out.println("Hellllooooo");
	}
	
}

public class J01_Lambda_Expression {
	public static void main(String[] args) {
//		MyFunctionalInterface type1 = () -> "Hello Worlds"; 
//		System.out.println(type1.sayHello());
		
//		MyFunctionalInterface type2 = (n) -> { return n+5; };
//		System.out.println(type2.addFive(7));
		
		MyFunctionalInterface type3 = (str1, str2) -> System.out.println(str1 + str2);
		type3.concatStrings("Hii ", "76543");
		
		
		//Type 4 - Iterating Collections (Maps, List etc.,) using forEach loop
		List<String> names = new ArrayList<>(Arrays.asList("John", "Peter", "Adam"));
		names.add("Khan");
		names.add("Fred");
		
		/* Iterate without using Lambda
		 Iterator iterator = names.iterator();
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
		 } 
		*/ //With Lambda
		names.forEach(name -> System.out.println(name));
		names.forEach(System.out::print);
		
		
		
		//Type 5 - Iterating Map in Java 8 using Lambda expression
		Map<Integer, String> employee = new HashMap<>();
		employee.put(101, "AK");
		employee.put(102, "Black");
		employee.put(103, "Calvin");
		
		/* Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/ 
		employee.forEach((kekey,vavalue)->System.out.println("Key-" + kekey + ", Value-" + vavalue));
		
	}
	
	
}
