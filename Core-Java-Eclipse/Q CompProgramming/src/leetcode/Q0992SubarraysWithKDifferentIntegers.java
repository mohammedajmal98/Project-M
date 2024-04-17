package leetcode;

import java.util.ArrayList;

public class Q0992SubarraysWithKDifferentIntegers {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,3};
		
		ArrayList<Integer> combo = new ArrayList<>();
			
			for(int i=0; i<nums.length-1; i++){
				combo.add(nums[i]);	
				combo.add(nums[i+1]);
				if(nums[i]!=nums[i+1]){
					System.out.println(combo);
				}
				combo.clear();	
			}
			
			for(int h=0; h<nums.length-2; h++){
				combo.add(nums[h]);	
				combo.add(nums[h+1]);
				if(combo.contains(nums[h+2])){
					combo.add(nums[h+2]);
					System.out.println(combo);
				}
				combo.clear();	
			}
			
		
	}

}
