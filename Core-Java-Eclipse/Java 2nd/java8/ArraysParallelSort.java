package java8;
//Advantage of Parallel Sort Over Simple Sort:
//The parallelSort() method uses the concept of multithreading which makes it much faster 
//compared to the normal sort when there are lot of elements.

/* The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join Framework 
 * for sorting sub arrays parallelly. The sorted sub arrays are merged. */

import java.util.Arrays;

public class ArraysParallelSort {

	public static void main(String[] args) {
		
		//Comparing Time difference between sort() and parallelSort()
		//sort()
		int[] arr = {23,2,56,39,1,19,90};
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		//parallelSort()
		int[] arr2 = {23,2,56,39,1,19,90};
		long start2 = System.currentTimeMillis();
		Arrays.parallelSort(arr2);
		System.out.println(Arrays.toString(arr2));
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		
		
		int[] arr3 = {32,3,56,43,7,11,87};
		Arrays.parallelSort(arr3, 1, 5);	
		//including start index and excluding end index [it is also available in sort(arrayName,startIndex,end)
		System.out.println(Arrays.toString(arr3));
	}
}
