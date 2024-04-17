package exceptionHandling;

//Exception - An unwanted event that interrupts the normal flow of the program
//If we catch properly, the program won't get terminated.

//Inside catch block whatever Exception we give, it will catch only that exception type and its subclass
// catch(Exception exc) -> Catches all types of Exceptions

/*NumberFormatException Hierarchy:
 * 		java.lang.Object <- java.lang.Throwable <- java.lang.Exception <- java.lang.RuntimeException
 * 		<- java.lang.IllegalArgumentException <- java.lang.NumberFormatException
 */
public class E01_Exception_Handling {
	
	private static void getInt(){
		//It goes up the call stack and check for any Catch available if it causes an exception
		int myInt = Integer.parseInt("check");
		System.out.println(myInt);
		System.out.println("After parsing");
	}

	public static void main(String[] args) {
		
		try{	//Code that may cause an exception
			getInt(); //If any exception occurs, it'll come back
			return;	//Eventhough we have return statements it'll still prints Finally block
		}
		
//		catch (NumberFormatException nfe){	//Code that we want to execute if this type of exception occurs
//			System.out.println("Can't parse to Integer");
//		}
//		catch (NullPointerException npe){	//Code that we want to execute if this type of exception occurs
//			System.out.println("Null pointer exception, dude");
//		}
		
		//Multi catch statements
		catch(NumberFormatException | NullPointerException e){
			System.out.println("Number check then null check");
		}
		
		finally{ //Code will always execute whether exception or not
			System.out.println("Finally! It's over");
		}
		
		System.out.println("Heyy!! Program won't get terminated even after exception but Statements after the line causes exception in try block won't get executed");

	}

}
