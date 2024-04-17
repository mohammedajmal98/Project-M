package important75LeetCode;


public class Q1732HighestAltitude {
	
	public static int largestAltitude(int[] gain) {
		
		int arr[] = new int[gain.length+1];
		arr[0] = 0;
		
		int i=1; 
		while(i<=gain.length) {
			arr[i] = arr[i-1] + gain[i-1];
			if(arr[i]>arr[0]){
				arr[0] = arr[i];          
			//we no longer needed arr[0], so we use it for 'result' purpose without creating new variable
			}
			i++;
		}
		//System.out.println(Arrays.toString(arr));
		return arr[0];	
    }

	public static void main(String[] args) {
		
		int[] gain = {-5,1,5,0,-7};   //output 1 [0,-5,-4,1,1,-6]-->so, highest altitude is "1"
		System.out.println(largestAltitude(gain));
		

	}

}
