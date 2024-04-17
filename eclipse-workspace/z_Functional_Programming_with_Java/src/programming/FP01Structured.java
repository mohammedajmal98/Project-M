package programming;

import java.util.List;

//Traditional Approach to print the list of all numbers
public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		//List.of() introduced in Java 9 like Arrays.asList() in Java 8
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers){
		//How to loop all the numbers
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
