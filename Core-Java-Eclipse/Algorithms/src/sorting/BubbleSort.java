package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,1,3,2,4};
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++){          // N      doubt in arr.length (or) arr.length-1 for 'i'
			boolean sorted = true;
			for(int j=0; j<arr.length-1; j++){    // N-1 
				if(arr[j]>arr[j+1]){
					sorted = false;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break;
			}
			//System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("After Sorting: " + Arrays.toString(arr));
		
		// BubbleSort1.java is more optimum as it breaks out of loop once it is sorted;
		// "Break" the loop at the right time is very important as it avoids unnecessary iterations
		// N * N-1 ==> O(N^2)


	}

}
