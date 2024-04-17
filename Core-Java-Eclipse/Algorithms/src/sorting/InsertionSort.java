package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,1,3,2,4};
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		for(int i=1; i<arr.length; i++){           // N
			for(int j=i-1; j>=0; j--){             // atmost 'N' so O(N^2)
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
				else{
					break;  //to avoid iterating array even after sorting. No need to loop if element are 
					//not swapped with previous index elements
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
