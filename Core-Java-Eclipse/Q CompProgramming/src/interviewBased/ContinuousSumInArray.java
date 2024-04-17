package interviewBased;

//sum of the continuous array which is the biggest

public class ContinuousSumInArray {

	public static void main(String[] args) {
		
		int a[] = {0,5,6,11,0,9,0,1,4,8,10};
		int sum = 0;
		int result = 0;
		
		
		for(int i=0; i<a.length-1; i++){
			sum = a[i] + a[i+1];
			if(sum>result){
				result = sum;	
			}	
		}
		System.out.println(result);

	}

}
