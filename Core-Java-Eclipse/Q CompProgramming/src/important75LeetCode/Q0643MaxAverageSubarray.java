package important75LeetCode;

//To avoid double 'for' loops, extract 'part' of the answer for next iteration from previous iteration
//Still, this below code is not 'time efficient(7 ms to run)' although it is 'memory efficient'

public class Q0643MaxAverageSubarray {
	
	public static double findMaxAverage(int[] nums, int k) {
		
		double maxAvg = Integer.MIN_VALUE, avg=0, total=0;
		
		int i=0; 
		while(i<nums.length) {
			total += nums[i];

			if(i >= k-1){
				avg = total/k;

				if(avg>maxAvg){
					maxAvg = avg;
			  }

				total -= nums[i-(k-1)];
			}	
			i++;
		}
		return maxAvg; 
    }

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};   //output: 12.75 (average of max 'k' contiguous sub array)
		int k = 4;						  // [12-5-6+50]/4 = 51/4 = 12.75
		System.out.println(findMaxAverage(nums,k));
	}

}
