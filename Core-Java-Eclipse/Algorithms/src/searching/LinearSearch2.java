package searching;

public class LinearSearch2 {
	
	public static int linearSearch(int arr[], int n){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==n){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[]{11, 79, 48, 66, 91};
		int result = linearSearch(arr, 7);
		
		if(result == -1){
			System.out.println("Element is not present, dude");
		}
		else{
			System.out.println("Yess! It is at the index " + result);
		}
	}

}
