package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {5,1,3,2,4};
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++){           // N
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++){     // N-i
				if(arr[minIndex] > arr[j]){
					int temp = arr[minIndex];
					arr[minIndex] = arr[j];
					arr[j]=temp;
				}	
			}
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("After Sorting: " + Arrays.toString(arr));
		
		//O(N^2)

	}

}
