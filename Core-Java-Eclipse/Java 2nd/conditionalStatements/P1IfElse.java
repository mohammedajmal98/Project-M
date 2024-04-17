package conditionalStatements;

import java.util.Scanner;

public class P1IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark in English(0-100): ");
		int mark = sc.nextInt();
		
		if (mark<=100){
			if (mark>=90) {
				System.out.println("Grade O");
			}
			else if(mark>=75){
				System.out.println("Grade A");
			}
			else if(mark>=35){
				System.out.println("Grade B");
			}
			else{
				System.out.println("No Grade");
			}
		}
		else{
			System.out.println("Invalid Input");
		}
		
		sc.close();
		
		
		//Ternary Operator (Short Hand if else..
		int a = 100, b = 200, max;
		max = (a>b)?a:b;
		System.out.println(max);
	}
}
