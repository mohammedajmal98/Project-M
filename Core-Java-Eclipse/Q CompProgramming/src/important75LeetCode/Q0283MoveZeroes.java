package important75LeetCode;

//change to 'while' loop and use less 'variable' for "Lesser Memory Allocation"

import java.util.Arrays;

public class Q0283MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
		int n = 0, count = 0;
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]!=0){
				nums[n] = nums[i];
				n++;
			}
			else{
				count++;
			}
		}
		System.out.println(n);             //non-zero count
		System.out.println(count);		   //zero count
		
		for(int i=nums.length-1; i>=n; i--){
			nums[i] = 0;
		}
		
		
		System.out.println(Arrays.toString(nums));
    }

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};   //expected: {1,3,12,0,0}
		moveZeroes(nums);
	}

}
