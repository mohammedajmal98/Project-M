package conditionalStatements;

import java.util.Scanner;

public class P3Switch {

	public static void main(String[] args) {
		float a = 10, b = 13;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator: ");
		operator = sc.next().charAt(0);   //nextChar() is not available, so we use like it
		
		switch(operator){   //In 'switch' and 'case' expressions, boolean, long, float, double are prohibited
		case '+' :
			System.out.println(a+b);
			break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a/b);
			break;
		case '%' :
			System.out.println(a%b);
			break;
		default :
			System.out.println("Invalid Input");
			
		}
		
		sc.close();
		

	}

}
