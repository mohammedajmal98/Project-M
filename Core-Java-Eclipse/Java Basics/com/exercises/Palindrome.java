package com.exercises;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original,reverse="";
		
		System.out.println("Enter a string/number to check if it is a palindrome:");
		
		Scanner input = new Scanner(System.in);
		original=input.nextLine();
		input.close();
		
		int length = original.length();
		for(int i = length-1; i>=0; i--){
			reverse= reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		if(original.equalsIgnoreCase(reverse)){        //To ignore case
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		

	}

}
