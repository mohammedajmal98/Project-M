package recursion.practice;

//Fibonacci but adding 3 previous numbers instead of two
// 0 1 1 2 4 7 13 24 44 81 149

public class R002_Fibonacci_using_3_numbers {
	
	private static int fibonacci3(int index){
		if(index <= 0){
			return 0;
		}
		else if(index == 1 || index == 2){
			return 1;
		}
		
		return fibonacci3(index-1) + fibonacci3(index-2) + fibonacci3(index-3);
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacci3(40));	//printing the 5th Index
	}

}
