package important75LeetCode;

public class Q1004MaxConsecutiveOnes {
	public static int longestOnes(int[] nums, int k) {
		int count = 0, maxLength = 0, value=0, iValue = 0, iValue2=0;
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]==0 && count<=k){	
				
			//	[1,0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1]
				if(count==0){				//	1,1,1,0,0,0,1,1,1,1,0
											//	0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1
					iValue = i;
				}
				if(count==1){
					iValue2 = i;
				}
				count++;
			}
			if(count<=k){
				maxLength++;
			}
			
			if(count==k+1 && nums[i]==0){
				if(maxLength>=value)
					value = maxLength;
				System.out.println(value);
				maxLength = maxLength - ((i-iValue)-(i-iValue2));
				System.out.println(maxLength);
				iValue = iValue2;
				count=count-1;
			}	
		}
		
		if(maxLength>=value)
			value = maxLength;
		
        return value;
    }

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1};
		System.out.println(longestOnes(arr, 8));
	}

}
