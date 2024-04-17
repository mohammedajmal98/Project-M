package dsa;

//Largest number atleast twice of others

public class LargestNumberTwice {
	
	public static int largestNumberIndex(int[] nums){
		int index = -1;
		int max = 0;
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]>=max){
				max = nums[i];
				index = i;
			}
		}
		for(int i=0; i<nums.length; i++){
			if(i==index){
				continue;
			}
			if(nums[i]*2 > max){
				return -1;
			}
		}
		
		return index;
	}
		
//		int a = 0;	// largest number
//		int b = 0;  // 2nd largest number
//		int index = -1;	//largest number index
//		
//		for(int i=0; i<arr.length-1; i++){
//			if(arr[i]>arr[i+1] && arr[i]>=a && arr[i+1]>=b){
//				a = arr[i];
//				b = arr[i+1];
//				index = i;
//			}
//			else if(arr[i]<arr[i+1] && arr[i]>=b && arr[i+1]>=a){
//				a = arr[i+1];
//				b = arr[i];
//				index = i+1;
//			}
//		}
//		System.out.println("a = " + a + " " + "b = " + b);
//		
//		if(a>=(b*2)){
//			return index;
//		}
//		return -1;
//	}

	public static void main(String[] args) {
		
		int arr[] = {0,1,0,3};
		
		System.out.println(largestNumberIndex(arr));

	}

}
