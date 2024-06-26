import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//All the classes and interfaces of the Stream API is in the java.util.stream package.

public class J05_Streams_01 {

	public static void main(String[] args) {
		System.out.println(
			"How Streams are useful: By using streams we can perform various aggregate \noperations on the data returned from collections, arrays, Input/Output operations.");	
		System.out.println();
		
		//Example 1
		List<String> animals = new ArrayList<>(Arrays.asList("tiger", "cheetah", "elephant"));
		animals.add("Cat");
		int count = (int)animals.stream().filter( a -> a.length()>5 && a.length()<8).count();
		System.out.println("Count is " + count);
		
		//Major difference between using Streams and enhanced for loop to iterate list is "PERFORMANCE"
		/* In Enhanced for loop - No Parallelism in the code
		 * Stream - Parallel execution of operations using stream is faster than 
		 * 			sequential execution without using streams.
		 * 
		 */
		
		System.out.println("\nHow to work with Streams in Java"+ "\n 1) Create a Stream" 
		+ "\n 2) Perform Intermediate Operations(transforms a stream into another stream). Eg: filter(), map(), sorted()"
		+ "\n 3) Perform Terminal Operations to get the result. Eg: count(), collect(), forEach(), reduce()");
		
		animals.stream();
	/*Benefits of Java Stream:
		No Storage
		Pipeline of Functions
		Laziness
		Can be infinite
		Can be parallelized
		Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.
	*/	
		System.out.println();
		
		//Example 2 - Concatenating two Streams
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Guava"));
		List<String> vegetables = new ArrayList<>(Arrays.asList("Carrot", "Beetroot", "Onion"));
		
		Stream<String> fruVeg = Stream.concat(fruits.stream(), vegetables.stream());
		fruVeg.forEach(str -> System.out.print(str + " "));
		
		System.out.println("\n");
		
		//Example 3 - Iterating and displaying selected integers - iterate(), limit(), skip(), filter()
		//The iterate() method takes two arguments: a seed and a function. A seed is the first element of the stream. The second element is generated by applying the function to the first element. The third element is generated by applying the function on the second element.
		Stream.iterate(13L, n->n+13).skip(2).limit(5).forEach(System.out::println);	
	}

}
