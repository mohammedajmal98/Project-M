
public class exc1 {

	public static void main(String[] args) {
		//exception handling --> To handle 'Runtime Errors' & to avoid program get's terminated abruptly with user
		//getting meaningful error message
		
		//If an error is in 'try' block, 'catch' block will execute
		
		/* Reason for exceptions:
		 * 		There are several reasons --> bad input data, opening a non-existing file, network problem etc.,
		 */
		
		/* Some Exceptions:
		 * 
		 * 1) ArithmeticException: It occurs when we divide a number by '0' (25/0)
		 * 
		 * 2) NullPointerException: When a variable contains 'null' value but you are performing an operation
		 * on the variable (Eg: str.length(); --> when String str = null;
		 * 
		 * 3) NumberFormatException: This exception occurs where there is a type mismatch (Perform Arithmetic
		 * Operation on a string variable) (Eg: int num = Integer.parseInt(str); --> when String str = "abcd";
		 * 
		 * 4) ArrayIndexOutOfBoundsException: When you are trying to access the array index which is beyond
		 * the size of an array
		 * 
		 */
		
		// Object<--Throwable<--Exception<--RuntimeException (extends)
		
		//Types of Exceptions : 1) User-Defined Exception 2) Built-in Exception
		
		/*  Built-in Exception : 
		 * 
		 * 1) Checked Exceptions --> All exceptions other than 'Runtime' exceptions are known as 'Checked' as
		 * the 'Compiler' checks them during compilation to see whether the programmer has handled them or not.
		 * If these exceptions are not handled/declared in the program, we'll get 'compilation error'
		 * 
		 * Eg: SQLException, IOException, FileNotFoundException, ClassNotFoundException, NoSuchMethodException etc.,
		 * 
		 * 
		 * 2) Unchecked Exceptions --> Runtime Exceptions are also known as Unchecked Exceptions. These are not
		 * checked at compile-time so compiler doesn't check whether programmer has handled or not. It is the
		 * responsibility of programmer to handle it for safe exit.
		 * 
		 * Eg: ArithmeticException, NullPointerException, NumberFormatException, ClassCastException etc.,
		 * 
		 */
		
		// Terms used in exception handling:
		/*
		 * 1) try : code that can cause the exception. If exception occurs, it transfers the flow of program 
		 * to the corresponding 'catch' block or 'finally' block.
		 * 
		 * 2) catch : it is where we write the logic to handle the exception caused by 'try' block.
		 * Only executes if an exception is caught by the 'try' block. It is always accompanied by a 'try' block.
		 * 
		 * 3) finally : This block always executes whether an exception is occurred or not. (& whether a exception
		 * is caught by 'catch' or not
		 * 
		 * 4) throw : It is used to explicitly throw an exception. (can throw checked & unchecked exceptions)
		 * 
		 * 5) throws : It is used in 'method signature'. It indicates that this method might throw one of the
		 * declared exceptions. While calling such methods, we need to handle the exceptions using try-catch block
		 * 
		 */
		
		
		

	}

}
