package searching;

public class BinarySearch2 {
	
	public static int binarySearch(int arr[], int n, int key){
		int low = 0;	int high = n-1;	
		
		while(low <= high){
			int mid = (high+low)/2;
			
			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid]<key){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
		int n = arr.length;
		int key = 50;
		
		int result = binarySearch(arr, n, key);
		
		if(result == -1){
			System.out.println("Element is not found, dude");
		}
		else{
			System.out.println("YEAHHH, Element is at the index " + result);
		}

	}

}
