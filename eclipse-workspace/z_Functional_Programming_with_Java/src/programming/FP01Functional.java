package programming;

import java.util.List;

//Functional Approach to print the list of all numbers
//In Traditional - we think how to do, but in Functional - we think what to do

//.stream -> make all the elements as flow of values (like Flow of water)
//.filter - checking the condition for every element (true or false). If true, proceeds the operation
//.map -> map each value/element to another value/condition as our wish
public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of() introduced in Java 9 like Arrays.asList() in Java 8
		
		// Exercise 5 - Print cubes of all ODD numbers
		numbers.stream()
			.filter(n->n%2!=0)
			.map(m->m*m*m)
			.forEach(s->System.out.println(s));
		
		// printAllNumbersInListFunctional(numbers);
		// printEvenNumbersInListFunctional(numbers);
		// printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", 
				"Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Exercise 2 - Print all courses individually
		//Exercise 3 - Print courses containing the word "Spring"
		//Exercise 4 - Print courses whose name has atleast 4 letters
			courses.stream()
					//.filter(s->s.contains("Spring"))	//Exercise 3
					//.filter(s->s.length()>=4) //Exercise 4
					.map(n->n + ": " +n.length()) //Exercise 6 (printing length)			
					.forEach(System.out::println); 
	}	

	// Just a print method for forEach()
	private static void print(int number) {
		System.out.println(number);
	}

	// Just an even number condition for Filter()
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// converting List of numbers to Stream->Then, specify what to do
		// with each one of them
		numbers.stream().forEach(FP01Functional::print);
		// Method Reference -> actually referring to a method which is defined somewhere
		// else
		// Class::MethodName(can also use System.out::println)
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven) //Filter - only allow Even Numbers
				.filter(n -> n % 2 == 0) // Lambda expression - Go ahead if condition is true
				.forEach(System.out::println);

		// can also use 'Lambda Expression in Filter for simpler way of defining method
//Lambda Expression - Defining the complete logic of the method right here
//Lambda Expression - Simplified Version of a Method
	}

	// Exercise 1 - Print Odd Numbers
	private static void printOddNumbersInListFunctional(List<Integer> numbers){
		
		numbers.stream()
				.filter(n->n%2!=0)	
				.forEach(System.out::println);
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
