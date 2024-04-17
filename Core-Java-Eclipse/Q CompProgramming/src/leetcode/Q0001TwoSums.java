package leetcode;

public class Q0001TwoSums {

	public static void main(String[] args) {
		int[] arr = {5,2,3,4,1,3,0,6};
		int target= 6;
		int sum=0;
		
		//My Try (O(n^2)) Time complexity
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(i!=j)
					sum +=(arr[i]+arr[j]);
				
				if(sum==target){
					System.out.println(i + " " + j);
				}
				sum=0;
			}
		}

	}

}
