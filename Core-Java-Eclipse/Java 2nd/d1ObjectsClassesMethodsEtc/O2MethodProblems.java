package d1ObjectsClassesMethodsEtc;

public class O2MethodProblems {
	
	//What is 'invoking method' --> Methods called through 'Objects'
	
	//1) Sum of digits of a number & count
	static int digitSum(int n){
		int lastDigit, sum = 0, count = 0;  
		
		while(n>0){
			lastDigit = n%10;
			sum += lastDigit;
			n=n/10;
			count++;
		}
		System.out.println(count);
		return sum;	
	}

	public static void main(String[] args) {
		System.out.println(digitSum(1234));
		welcomeMsg();
	}
	
	//2) Print 'Welcome' Message in a box
	static void welcomeMsg(){
		System.out.println("/---------\\");
		System.out.println("| WELCOME |");
		System.out.println("\\---------/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
