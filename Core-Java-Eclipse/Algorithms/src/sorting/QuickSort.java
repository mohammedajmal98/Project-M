package sorting;
//O(N logN)

/*Steps: 
 * 1) Choose the Pivot, 
 * 2) Do the partitioning, 
 * 3) Do recursive quick sort calls
 */

import java.util.Arrays;

public class QuickSort {
	
	private static void quickSort(int arr[], int startIndex, int endIndex){
		
		//If we deal with subarray of one element, it simply returns nothing
		if(startIndex >= endIndex){
			return;
		}
		
		int pivot = arr[endIndex];
		int leftPointer = startIndex;
		int rightPointer = endIndex;
		
		//Till leftPointer meets the rightPointer at the same index, the loop should continue
		while(leftPointer < rightPointer){
			//leftPointer moves one index forward if it satisfies the condition (should be <= pivot value) and stop if not.
			while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
				leftPointer++; 
				//keep incrementing left pointer until the value of the array at the left pointer is greater than the pivot
			}
			//righttPointer moves one index backward if it satisfies the condition (should be >= pivot value) and stop if not.
			while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
				rightPointer--;
				//keep decrementing right pointer until the value of the array at the right pointer is lesser than the pivot
			}
			
			//Now, both pointer stops at some different/same index. So, we swap both indexes by calling swap()
			swap(arr, leftPointer, rightPointer);
			
			System.out.println(Arrays.toString(arr) + ", leftPointer = " + leftPointer + " + rightPointer = " + rightPointer);
		}
		
		swap(arr, leftPointer, endIndex);	
		//This stage denotes both leftPointer & rightPointer at the same index/position. So replace that index value with pivot value
		
		//Recursively quick sort the left partition
		quickSort(arr, startIndex, leftPointer-1);
		//Recursively quick sort the right partition
		quickSort(arr, leftPointer+1, endIndex);
	}
	
	//Method to swap the values of those indexes using 'temp' (temporary variable)
	private static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	

	public static void main(String[] args) {
		System.out.println("Hey John!!");
		
		int arr[] = {4,9,6,2,1,8,3,7};
		//Printing Random numbers
//		Random rand = new Random();
//		int[] arr = new int[10];
//		
//		for(int i=0; i<10; i++){
//			arr[i] = rand.nextInt(100);	//Random integers between 0 and 99
//		}
		System.out.println("Before sorting: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
