package searching;

public class BinarySearch2Recursion {
	
	public static int binarySearchRecursion(int arr[], int low, int high, int key){
		
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
		int n = arr.length;
		int key = 50;
		
		int result = binarySearchRecursion(arr, 0, n-1, key);
		
		if(result == -1){
			System.out.println("Element is not found, dude");
		}
		else{
			System.out.println("YEAHHH, Element is at the index " + result);
		}

	}


}
