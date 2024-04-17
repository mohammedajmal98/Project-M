package dsa;

// This is not an efficient solution. But we can improve 

import java.util.Arrays;

public class Q1991PivotIndex {
	
	public static int pivotIndex(int[] arr){
		
		int[] sumLeft = new int[arr.length];
		int[] sumRight = new int[arr.length];
	
		sumLeft[0] = 0;
		sumRight[arr.length-1] = 0;
		
		for(int i=1; i<arr.length; i++){
			sumLeft[i] = sumLeft[i-1] + arr[i-1];
		}
		for(int i=arr.length-2; i>=0; i--){
			sumRight[i] = sumRight[i+1] + arr[i+1];
		}
		System.out.println(Arrays.toString(sumLeft));
		System.out.println(Arrays.toString(sumRight));
		
		
		for(int i=0; i<arr.length; i++){
			if(sumLeft[i] == sumRight[i]){
				return i;
			}
		}
		return -1;
	}
	


	public static void main(String[] args) {
		int[] arr = {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
	}
}
