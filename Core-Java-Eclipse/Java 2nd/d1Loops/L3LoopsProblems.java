package d1Loops;

public class L3LoopsProblems {

	public static void main(String[] args) {
		
	//Problem 1 - Odd numbers
		int n = 10;
		for(int i = 1; i<=n*2; i+=2){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	//Problem 2 - Sum of first N natural numbers
		int sum = 0;
		int N = 10;
		for(int i=1; i<=N; i++){
			sum = sum + i;
		}
		System.out.print(sum + " ");
		
		System.out.println();
		
	//Problem 3 - Factorial of n
		int m = 3; 
		int fact = 1;
		
		for (int i=1; i<=m; i++){
			fact = fact*i;	
		}
		System.out.println(fact);
	}

}
