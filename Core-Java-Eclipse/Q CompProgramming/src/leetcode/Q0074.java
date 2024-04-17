package leetcode;

//Approach is 'Binary Search' but without converting this 2D array to 1D array

public class Q0074 {
	
	public static boolean elementSearch(int arr[][], int target) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		int left = 0;
		int right = (rows * cols) - 1;
		
		while(left <= right){
			int mid = (left + right)/2 ;
			
			int current = arr[mid/cols][mid%cols];
			
			if(current == target){
				return true;
			}
			if(current < target){ 
				left = mid + 1;	
			}
			else {
				right = mid - 1;
			}		
		}
		return false;
	}

	public static void main(String[] args) {
		int a[][] = {{1,3,5},{10,11,16},{23,30,34},{36,38,40}};
		int k = 40;
		
		System.out.println(elementSearch(a,k));

	}

}
