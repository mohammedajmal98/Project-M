package method_references;
/*
 Method reference is a shorthand notation of a lambda expression (that contains just one method call)
 to call a method. There are four types of method references that are as follows:
		1) Static Method Reference
		2) Instance Method Reference of a particular object
		3) Instance Method Reference of an arbitrary object of a particular type
		4) Constructor Reference.
		
NOTE: In Java 8 we can use the method as if they were objects or primitive values, and we can 
treat them as a variable. The example shows the function as a variable in java:
	// This square function is a variable getSquare. 
	Function<Integer, Integer> getSquare = i -> i * i; 
	
	// Pass function as a argument to other function easily
	SomeFunction(a, b, getSquare); 
	
The method references can only be used to replace a single method of the lambda expression. In 
general, one doesn’t have to pass arguments to method references.
 */

public class Method_Reference {

	public static void main(String[] args) {
		

	}

}
