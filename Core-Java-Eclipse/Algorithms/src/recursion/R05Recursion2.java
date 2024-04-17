package recursion;

//complexity - 2^n

public class R05Recursion2 {
	
	static int count = 0;
	
	static int fibonacci(int number){
		count++;   //to check the 2^n complexity
		
		if(number<=1){
			return number;
		}
		return fibonacci(number-2) + fibonacci(number-1);
	}

	public static void main(String[] args) {
		int n = 10;
		for(int i=1; i<=n; i++){
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println("\n" + count);
	}

}
