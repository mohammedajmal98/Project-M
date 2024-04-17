package leetcode;
//we can observe the "Fibonacci Series" pattern here. So, we use the same code we use for Fibonacci Sequence

public class Q0070ClimbingStairs {
	
	public static int climbingStairs(int n){
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i<n+1; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}

	public static void main(String[] args) {
		System.out.println(climbingStairs(10));  // 1 1 2 3 5 8 13 21 34 55 89

	}

}
