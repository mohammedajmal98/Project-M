package sorting;

// example array = {5,1,3,2,4}

public class Sorting {
	
	/* Sorting algorithms --> to sort the list of elements in a particular order(ascending,descending,alphabetical etc)
	 * Types: 
	 * 		1) Selection Sort - Sorting Indexwise 
	 * 				Firstly, 0th index element is compared to other elements and swap the position if any other
	 * 			element is minimum in any particular index. Eg: If 1st index value is 1 and 0th index is 5, 
	 * 			the position will be changed. Result is arr[0]=1, arr[1]=5 --> {1,5,3,2,4}
	 * 			After that, it moves to 1st index and compare to other elements in the right side(not left as
	 * 			it is already sorted}
	 * 			Key Note: In this, array is sorted 1 element from left side(small value) after every iteration
	 * 			Time Complexity : N * (N-i) ==>  O(N^2)
	 * 
	 * 
	 * 		2) Bubble Sort - Sorting based on adjacent element (swap if needed)
	 * 				Compare adjacent element and swap it if it is greater than adjacent element and continue it.
	 * 			compare 0th index and 1st index, then 1st index and 2nd index etc., (1st Iteration completed)
	 *          continues... for upcoming 'N' iterations
	 *          Key Note: In this, array is sorted 1 element from right side(big value) after every iteration
	 *          Time Complexity : N * (N-1) ==> O(N^2)
	 *          
	 * 
	 * 		3) Insertion Sort - Sorting based on comparing 1st index to 0th index. {5,1,3,2,4}
	 * 			If 1st index is small, both are swapped.{1,5,3,2,4}
	 * 			Then 2nd index compare to 1st index and swap if needed.{1,3,5,2,4}
	 * 			If it swaps, it again compares to 0th index and swap if needed. {1,3,5,2,4}-->not needed here
	 *          If it stops swapping to the previous element, we can stop the current iteration and move to 
	 *          next iteration .
	 * 			Likewise, it continues...
	 * 			Time Complexity: O(N^2)
	 * 
	 * 
	 * 		4) Quick Sort
	 * 
	 * 
	 * 		5) Merge Sort
	 */

}
