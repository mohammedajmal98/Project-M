import java.util.Arrays;

/*Algorithm of parallel sorting:
1. The given array is divided into the sub arrays and the sub arrays are further divided into the 
their sub arrays, this happens until the sub array reaches a minimum granularity.
2. The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join 
Framework for sorting sub arrays parallelly.
3. The sorted sub arrays are merged.
 * 
 * The parallelSort() method uses the concept of multithreading which makes it much faster compared 
 * to the normal sort when there are lot of elements.
 * 
 */
public class J11_Arrays_ParallelSort {

	public static void main(String[] args) {
		Integer[] arr = {12, 45, 03, 18, 38};
		
		//Parallel Sort by specifying the start and end index
		Arrays.parallelSort(arr, 1, 4); //Start index included but end index not included
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		//Sorting Primitive Data types with Parallel Sort
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
	}
}
