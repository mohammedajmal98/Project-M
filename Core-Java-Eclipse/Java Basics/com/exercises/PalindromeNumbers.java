package com.exercises;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		int orig,rev=0,r;
		
		System.out.println("Enter the number to check palindrome:");
		
		Scanner input = new Scanner(System.in);
		orig=input.nextInt();
		input.close();
		
		int n=orig;
		while(orig>0){
			r = orig%10;
			rev = (rev*10) + r;
			orig = orig/10;	
		}
		
		if(n==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		

	}

}
