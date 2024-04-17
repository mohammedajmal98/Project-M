
public class exc2 {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 0;
		
		try{
			int result = num1/num2;
			System.out.println(result);
			System.out.println("Hiii");
		}
		
		catch(Exception e){          //can use 'Exception' generally (or) 'ArithmeticException' specifically
			System.err.println("Invalid Input");     //to print error message in 'red' color
			System.out.println("Error Message " + e);
		}
		finally{
			System.out.println("Execution completed");
		}
	
	}

}
