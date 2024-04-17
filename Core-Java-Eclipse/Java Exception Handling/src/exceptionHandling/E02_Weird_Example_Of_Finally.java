package exceptionHandling;

public class E02_Weird_Example_Of_Finally {

	public static void main(String[] args) {
		System.out.println(printANumber());
	}
	
	public static int printANumber(){
		try{
			return 3;
		}
		catch(Exception e){
			return 4;
		}
		finally{
			//System.out.println(9);
			return 5;	//It overrides the value of try/catch blocks because it always executes
			
		}
		//Mostly, we don't use 'return' in try/catch block. Try to avoid using return in these blocks
		//Finally is very useful in closing the database connections or File connections to avoid resource keep open
	}

}
