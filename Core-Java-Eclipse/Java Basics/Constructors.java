class ConstructorCheck {
	
	int num1;
	int num2;

	public ConstructorCheck() {
		
		int j = 6;
		System.out.println("I'm from Default Constructor " + (j+5));
		
	}
	
	public ConstructorCheck(int n) {
		num1 = 10;
		num2 = n+2;
	}
	
	public ConstructorCheck(double d) {
		
		num1 = (int)d;
	}
}




public class Constructors {

	public static void main(String[] args) {
		
		
		
		ConstructorCheck obj = new ConstructorCheck();
		
		
		ConstructorCheck obj1 = new ConstructorCheck(5);
		System.out.println(obj1.num1+ "\n" + obj1.num2);
		
		ConstructorCheck obj2 = new ConstructorCheck(3.6);
		System.out.println(obj2.num1);
		
		
		
		
		
	}

}
