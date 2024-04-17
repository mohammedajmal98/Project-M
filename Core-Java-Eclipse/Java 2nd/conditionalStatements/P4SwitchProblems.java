package conditionalStatements;

import java.util.Scanner;

public class P4SwitchProblems {
	public static void main(String[] args) {
		//to check vowel or consonant in alphabet
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet in caps: ");
		char letter = sc.next().charAt(0);
		
		letter = Character.toUpperCase(letter);  //Primitive datatype don't work on toUpperCase() method
		
		switch(letter){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a vowel");
			break;
		default :
			System.out.println("It is a consonant");
		}
		sc.close();
		
		//Problem 2
//		int a = 34, b = 55;
//		int c = 66;
		
//		switch(a>b){          //can't use boolean, long, float, double in 'switch' or 'case'
//		case a>b:
//			System.out.println("hIii");
//		case 66:
//			System.out.println("Hello");
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}

}
