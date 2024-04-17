package generics;
// Wildcard (?)
//Why we need WildCard? -> If we want to print the List that can have any type of Object

import java.util.ArrayList;
import java.util.List;

//List<Object> != List<Integer>
//	Eventhough Integer is a subclass of Object, List of Integer is not a sub class of List of Object

public class G05_WildCard_in_Generics {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(25);
		intList.add(50);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		catList.add(new Cat());
		printList(catList);
		
	}
	
	//Bounded Wildcards. same as bounded Generics, eg: <? extends Animal>
//	private static <T> void  printList(List<T> myList){	
	private static void printList(List<?> myList){
//Both works but I can't use Wildcard in method parameters type. 
		// Because ? only useful in Generics inside "<>" 
		//(Refer methods of G04_Generic_Methods) -> Can't use Wildcards there
		System.out.println(myList);
	}
}
