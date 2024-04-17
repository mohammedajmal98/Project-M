package searching;
//To do binary search, the array must be a sorted one

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {4,7,9,14,15,20};			//sorted array
		int left = 0;
		int right = arr.length-1;
		int searchValue = 15;
		
		System.out.println(binarySearch(arr,left,right,searchValue));
	}
		
	static int binarySearch(int arr[], int left, int right, int searchValue){	
		if(searchValue<arr[left] || searchValue>arr[right]){
			System.out.println("Element not found in the array before searching");
			return -1;
		}
		//printing the index of the search element
		while(left<=right){
			int mid = (left + right)/2;
			if(arr[mid] == searchValue){
				System.out.print("Index of the element is: ");
				return mid;
			}
			else if(arr[mid] < searchValue){ 
				left = mid + 1;	
			}
			else if(arr[mid] > searchValue){
				right = mid - 1;
			}		
		}
		if(left>right){
			System.out.println("Element not found after searching");
		}
		return -1;	
	}
}
