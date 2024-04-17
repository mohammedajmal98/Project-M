package com.exceptions;


public class AExceptionBasics {

	
	public static void main(String[] args) {
		
		try {
			int i = 10;
			int j = 0;
			System.out.println("Hii");
			int k = i/j;
			System.out.println(k);
		}
		
		catch (Exception e) {                        // also specify the exception eg: (Arithmetic Exception e)
			System.err.println("Exception is there in try block");	//can use "err" to print in red color
		}
		
		finally {
			System.out.println("Finished!!");
		}
		
		

	}

}
