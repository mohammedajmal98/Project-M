package com.exercises;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int value;
		long result=1;
		
		System.out.println("Enter the number(factorial):");
		
		Scanner input= new Scanner(System.in);
		value=input.nextInt();
		
		input.close();
		
		if(value<0){
			System.out.println("Invalid entry");
		}
		else if(value==0){
			System.out.println(1);
		}
		else{
			for(int i=1; i<=value; i++){
				result*=i;
				System.out.println(result);
			}	
		}
		System.out.println("Factorial of "+value+" is " + result);
	}

}
