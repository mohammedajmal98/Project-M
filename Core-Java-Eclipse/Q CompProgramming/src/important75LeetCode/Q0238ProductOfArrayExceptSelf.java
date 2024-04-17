package important75LeetCode;

import java.util.Arrays;

public class Q0238ProductOfArrayExceptSelf {
	
	public static int[] productArray(int[] nums){
		int[] answer = new int[nums.length];
		int total = 1;
		
		for(int i=0; i<nums.length; i++){
			int temp = nums[i];
			nums[i] = 1;
			for(int j=0; j<nums.length; j++){
				total *= nums[j];	
			}
			answer[i] = total;
			total = 1;
			nums[i] = temp;
		}		
		return answer;
	}

	public static void main(String[] args) {
		//Input nums = [1,2,3,4] Output: [24,12,8,6] (or) [-1,1,0,-3,3] [0,0,9,0,0]
		
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productArray(nums)));
	}

}
