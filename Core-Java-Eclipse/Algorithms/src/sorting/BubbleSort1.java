package sorting;
//Bubble Sort --> Compare its adjacent and replace the position if needed
//O(N2) --> Worst case,  O(N) --> Best case

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		int arr[] = {5,3,2,4,6};
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr){
		while(true){
			boolean sorted = true;
			for(int i=0; i<arr.length - 1; i++){
				if(arr[i]>arr[i+1]){
					sorted = false;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				//System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break;
			}
		}	
	}

}
