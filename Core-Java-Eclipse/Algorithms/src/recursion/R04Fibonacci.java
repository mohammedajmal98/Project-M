package recursion;

public class R04Fibonacci {
	
	static int fibonacci(int value){
		if(value==0){
			return 0;
		}
		if(value==1 || value==2){
			return 1;
		}
		return fibonacci(value-1) + fibonacci(value-2);
	}

	public static void main(String[] args) {
		int value = 50;
		
		for(int i=0; i<value; i++){
			System.out.print(fibonacci(i) + " ");
		}

	}

}
