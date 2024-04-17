package recursion.practice;

import java.util.Arrays;

//Fibonacci but adding 3 previous numbers instead of two
// 0 1 1 2 4 7 13 24 44 81 149

public class R003_Fibonacci_using_3_numbers_Memoization {
	
	private static long[] arrValue; 
	
	public static void main(String[] args) {
		int n = 40;
		arrValue = new long[n+1]; //since n is 6, we need to store 7 values as it is index-based

		System.out.println(fibonacci3(40));	//printing the nth Index
		System.out.println(Arrays.toString(arrValue));
	}
	
	private static long fibonacci3(int index){
		if(index <= 0){
			return 0;
		}
		else if(index == 1 || index == 2){
			return 1;
		}
		
		//Condition for memoization
		if(arrValue[index] != 0){
			return arrValue[index];
		}
		
		//Stores result in particular position
		arrValue[index] = fibonacci3(index-1) + fibonacci3(index-2) + fibonacci3(index-3);
		
		
		return arrValue[index];
	}

	

}
