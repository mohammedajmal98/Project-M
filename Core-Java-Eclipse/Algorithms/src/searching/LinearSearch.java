package searching;

import java.util.Arrays;

//Best case : O(1), Worst case : O(N)

public class LinearSearch {
	
	//To check the 'integer' and return its "index"
	public static int linearSearch(int arr[], int target){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
	
	//To check the 'character' in 'String' and return its "index"
	public static int linearSearch(String str, char target){
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==target){
				return i;
			}
		}
		return -1;
	}
	
	//To check 'integer' in 2D Array and return its "index"
	public static int[] linearSearch(int arr[][], int target){
		for(int i=0; i<arr.length; i++){                //row
			for(int j=0; j<arr[i].length; j++){			//column
				if(arr[i][j]==target){
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int array[] = {3,5,2,6,8,1,7};
		int value = 7;
		System.out.println(linearSearch(array,value));
		
		System.out.println(linearSearch("Hello",'o'));
		
		int array2[][] = {{2,4,6},{8,10,12,14},{16,18}};
		int[] result = linearSearch(array2, 14);
		System.out.println(Arrays.toString(result));
	}

}
