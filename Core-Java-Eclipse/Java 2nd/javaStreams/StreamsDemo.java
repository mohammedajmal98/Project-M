package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;			//As we use Comparator Interface, we need this package
import java.util.List;
import java.util.function.Consumer;		//having all Functional Interfaces
import java.util.stream.Collectors;		//util.stream.* -> needed for stream operations
import java.util.stream.Stream;

/*Collections - we use 'Collection' to represent a group of Objects in a single entity.
 * If we want to process objects from the "Collection", we use "Streams"
 * IOStreams(Stream of data) and java.util.Streams(Stream of Objects) are different
 * Wherever Collection is there, Stream is required for processing 
 * 
 * Stream gives "concise code" which is the result of "Functional Programming" rather than OOP to compete with other
 * From Java 8, it starts supports some Functional Programming(Lambda Expression, Streams, Functional Interface)
 * 
 * Java 9 - jShell (like idle in Python)
 * Java 10 - we can declare "local variable" without mentioning its type. eg: var x = 10; (like in Js)
 * 		It is a dynamic typed programming feature
 * 
 * If Java introduce EJB as lightweight and better architecture at initial stage, Spring won't be much popular
 * and maybe Spring would be no more. But at the first release of EJB, it was heavy weight and poor architecture
 * so Spring won the race. Also instead of Servlet(difficult technology), if Java releases "JSP"(easy technology)
 * first, Java would be dominating now in Web side also.
 * 
 * 	filter(Predicate) -> Predicate returns only boolean (useful for conditional checks)
 * 	map(Function) -> Function returns any type we need (useful for business logics/to do some operations)
 *  collect(Collector) -> collect all the objects 
 *  count() -> count the no of objects in the Stream
 *  sorted() -> for natural sorting order (implicitly using Comparable interface - compareTo())
 *  sorted(Comparator) -> for Customized Sorting order (Comparator interface - compare())
 *  	eg: i and j, i,j -> i.compareTo(j)
 *  min(Comparator) & max(Comparator) -> min prints 1st element and max prints last element of sorted array
 *  forEach(Consumer) -> it process every object/element present
 *  
 *  Methods : filter(), map(), collect(), count(), sorted(), sorted(Comparator), min(Comparator), 
 *  	max(Comparator), forEach(Consumer), toArray(Constructor reference), Stream.of(),
 */



public class StreamsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(76);	marks.add(33);	marks.add(45);	marks.add(31);	marks.add(12);
		//or Arrays.asList(0,5,10,15,20);
		System.out.println(marks);
		
		//get only even numbers using "filter" and add 2 to every even number using "map" method
		//and collect it in a list using "collect" and store it in a "List"
		List<Integer> lEven = marks.stream().filter(m->m>=30&&m<35).map(m->m+5).collect(Collectors.toList());
		System.out.println(lEven);
		
		//marks.stream() -> this method creates "marks" arraylist(a Collection) as a "stream"
		//.filter() -> filter objects based on the condition we need
		//.map() -> adds any function on the resultant objects
		//.collect() -> it collects all the Objects as "List" using Collectors.toList() [Collectors only has 
		// 	toList() method
		
		//No of failed students - using count()
		long noOfFailedStudents = marks.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStudents);
		
		// sorted() - sort the Objects in natural sorting order (small to big) -> implicitly use "Comparable" Interface
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedMarks);
		
		//For Customized sorting, use Comparator Interface(Functional Interface) -> sorted(Comparator)
		List<Integer> customSortedMarks = marks.stream().sorted((i,j)->(i<j)?1:(i>j)?-1:0).collect(Collectors.toList());
		System.out.println(customSortedMarks);
		
		//Comparator<Integer> c = (i,j)->(i<j)?1:(i>j)?-1:0;
		//Comparable -> compareTo(), Comparator -> compare()
		
//		1 -> i should come next to j [if i<j maps to 1] and vice versa
//		-1 -> i should come before j
//		0 -> i and j are equal
		System.out.println();
		
		//Ascending Order
		List<Integer> compareTo1 = marks.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(compareTo1);
		
		//Descending Order
		List<Integer> compareTo2 = marks.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
		System.out.println(compareTo2);
		List<Integer> compareTo3 = marks.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println(compareTo3);
		
		//Above same things are applicable to String as well (Natural order - Alphabetically)
		
		//If we need to sort the strings using length
		List<String> lengths = Arrays.asList("one","three","hundred","ten","seventy","Ninety nine","five");
		System.out.println(lengths);
		Comparator<String> c = (s1,s2)->{
									int l1 = s1.length();
									int l2 = s2.length();
									if(l1>l2) return 1;
									else if(l1<l2) return -1;
									else return s1.compareTo(s2);
		};
		
		List<String> sortedLength = lengths.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedLength);
		
		
		//min(Comparator) ->1st element of sorted order and max(Comparator) -> last element of sorted order 
		
		Integer min = marks.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(min);  		//max is also same
		
		//If we change the sorting order to desc, still min() gets the first value of the resultant sorted arr
		Integer min2 = marks.stream().min((i,j)->-i.compareTo(j)).get();
		System.out.println(min2);
		
		//forEach(Consumer) -> for every element/object present in that particular step of the process
		marks.stream().filter(m->m<35).forEach(i-> System.out.print(i+" "));
		System.out.println(	);
		
		Consumer<Integer> con = i-> System.out.print(i + " ");
		marks.stream().forEach(con);
		
		
		
		//toArray() - to convert stream of objects into an array using "Constructor reference"
		//toArray() also available in Collections
		Integer[] i = marks.stream().toArray(Integer[]::new);
		for(int j : i){
			System.out.println(j);
		}
		//	Sample::new  -> returns/create 'Sample' object
		//	Integer[]::new	-> returns Integer Array Object
		
		
		//To convert array elements to stream. use static method "of()" from "Stream" class
		Stream.of(i).forEach(System.out::print);
		
		Stream.of(1,"88",'c',1111,"hello").forEach(System.out::print);	//It is not "type safety"
		
		//we have to use like this
		Stream<Integer> s = Stream.of(1,11,111,1111);		//Type safety
		s.forEach(System.out::print);
		
		
		
		
		
		
		

	}

}

/* Filter:
 * 	Input - 10 elements, Output - 0-10 elements 
 * 
 * Map:
 * 	Input - 10 elements, Output - 10 elements
 * 
 * Collect:
 * 
 * 
 * 
 * 
 */









