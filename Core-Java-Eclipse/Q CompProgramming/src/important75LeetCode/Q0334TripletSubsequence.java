package important75LeetCode;

public class Q0334TripletSubsequence {
	
	public static boolean isTripletPresent(int[] nums){
		
		for(int i=0; i<nums.length-2; i++){
			if( (nums[i] < nums[i+1]) && (nums[i+1]< nums[i+2])){
				return true;
			}	
		}
		return false;
	}
	

	public static void main(String[] args) {
		
		int[] nums = {5,4,3,2,1,0,-3,-2,-1};   //output 'true'
		System.out.println(isTripletPresent(nums));

	}

}
