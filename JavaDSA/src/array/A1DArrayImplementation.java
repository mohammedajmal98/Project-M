package array;

import java.util.Arrays;

public class A1DArrayImplementation {
	
	public static void main(String[] args) {
		int[] arr = {1,5,2,8,7,3};
		A1DArrayImplementation array = new A1DArrayImplementation();
		
		System.out.println("Before adding: " + Arrays.toString(arr));
		
		//adding new element to the array
		arr = array.addElement(arr,4,15);
		System.out.println("After adding: " + Arrays.toString(arr));
		
		//search
		int index = array.search(arr, 8);
		System.out.println("Index is " + index);
		
		//delete
		arr = array.deleteElement(arr, 7);
		System.out.println("After deleting: "  + Arrays.toString(arr));
		
	}
	
	public int[] addElement(int[] arr, int position, int value){
		int[] result = new int[arr.length + 1];
		for(int i=0; i<position; i++){
			result[i] = arr[i];
		}
		result[position] = value;
		
		for(int i=position+1 ; i<result.length; i++){
			result[i] = arr[i-1];
		}
		return result;
	}
	
	public int search(int arr[], int value){
		int index = -1;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == value){
				return i;
			}
		}
		return index;
	}
	
	public int[] deleteElement(int arr[], int value){
		
		int index = search(arr, value);
		if(index>=0){
			for(int i=index+1; i<arr.length; i++){
				arr[i-1] = arr[i];
			}
		}
		return Arrays.copyOf(arr, arr.length-1);
	}
}
