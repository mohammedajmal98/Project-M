package basic;

//Fibonacci : 0 1 1 2 3 5 8 13 21 34 55

public class Fibonacci {
	
	
	static int fibonacci(int n){
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		/*
		 * 		fib(5)
		 * 		fib(4)					 + 					fib(3)
		 * 		fib(3)+fib(2)			 +					fib(3)
		 * 		fib(2)+fib(1)+1 		 +					fib(3)
		 * 		1+0+1					 +					fib(3)
		 * 		2						 +					fib(2)+fib(1)
		 * 		2						 +					1+0
		 * 		3
		 * 
		 * 		(Answer: 3) -> 5th element in the Fibonacci Series is 3
		 * 
		 * 
		 */
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		
	}

}
