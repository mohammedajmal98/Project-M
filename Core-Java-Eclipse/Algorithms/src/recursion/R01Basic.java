package recursion;

public class R01Basic {
	
	static int f1 = 0, f2=1;
	
	//Factorial
	static int recursion(int n){
		if(n==1){
			return 1;
		}
		return n * recursion(n-1);
	}
	
	//Fiboacci Sequence
	static void fibonacci(int f){              // 0 1 1 2 3 5
		int f3 = f1 + f2;
		System.out.print(f3 + " ");
		f1=f2;
		f2=f3;
		
		if(f>1){
			fibonacci(f-1);
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("Success restart");
		System.out.println(recursion(4));	//Factorial
		fibonacci(5);	//Fibonacci
	}
}
