package important75LeetCode;
//Kids with the Greatest number of candies

import java.util.LinkedList;
import java.util.List;

public class Q1431Candies {
	
	    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	    	
			List<Boolean> result = new LinkedList<Boolean>();   
	        //create a 'boolean' list to store values to return
			//To find greatest number in the array
			int n = 0;
			int j=0; 
			while(j<candies.length){ 
				if(candies[j]>n){
					n=candies[j];
				}
				j++;
			}
			j=0;
			//'n' is the largest element in the array
			
			//To check whether any element is the largest or more after adding  extra candies
	 
			while(j<candies.length){
				if(candies[j] + extraCandies >= n){
					result.add(true);
				}
				else{
					result.add(false);
				}
				j++;
			}
			return result;
		  
	}

	public static void main(String[] args) {
		int array[] = {1,2,6,4,0,7,9};
		int extraCandies = 3;
		//receiving a resultant "boolean" array by creating another boolean array to store values
		List<Boolean> finalResult = kidsWithCandies(array,extraCandies);  
		System.out.println(finalResult);
	}
}
