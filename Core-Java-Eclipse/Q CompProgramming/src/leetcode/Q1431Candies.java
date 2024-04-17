package leetcode;
//Kids with the Greatest number of candies

import java.util.Arrays;

public class Q1431Candies {
	
	static boolean[] candyCount(int arr[], int extra){
		boolean[] result = new boolean[arr.length];   //create a 'boolean' array to store values to return
		//To find greatest number in the array
		int n = 0;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				n=arr[i];
			}
			else if (arr[i+1]>arr[i]){
				n=arr[i+1];
			}
		}
		System.out.println(n);    //'n' is the largest element in the array
		
		//To check whether any element is the largest or more after adding extra candies
		for(int i=0; i<arr.length; i++){
			if(arr[i] + extra >= n){
				result[i] = true;
			}
			else{
				result[i] = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int array[] = {1,2,6,4,0,7,9};
		int extraCandies = 3;
		//receiving a resultant "boolean" array by creating another boolean array to store values
		boolean[] finalResult = candyCount(array,extraCandies);  
		System.out.println(Arrays.toString(finalResult));
	}
}
