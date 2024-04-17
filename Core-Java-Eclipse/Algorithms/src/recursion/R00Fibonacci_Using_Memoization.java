package recursion;

import java.util.Arrays;

//Using Memoization to make working fast
//Without Memoization, n=50 takes around 2 mins, With memoization, n=50 takes only 2 seconds

//Trivia: Even we use long, n=92 is the last positive value. After that, it becomes negative etc.,
//long limit (9 Quintillions app.) -> 9,223,372,036,854,775,807

// Fibonacci f(n) = f(n-1) + f(n-2)

public class R00Fibonacci_Using_Memoization {
	//Using Memoization, to avoid calculating again & again the same number
	private static long[] fibonacciCache;

	public static void main(String[] args) {
		int n = 100;
		fibonacciCache = new long[n+1];	
		
		System.out.println(fibonacci(n));	// 0 1 1 2 3 5 8 13 21 34 55
		//to print all fibonacci numbers, use 'for loop'
//		for(int i=0; i<=n; i++){
//			System.out.print(fibonacci(i) + " ");
//		}
		System.out.println(Arrays.toString(fibonacciCache));
	}

	private static long fibonacci(int n) {
		if(n<=1){
			return n;
		}
		
		//Condition check for memoization (if the value is already calculated, just reuse it
		if(fibonacciCache[n] != 0){
			return fibonacciCache[n];
		}
		
		long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}
}
