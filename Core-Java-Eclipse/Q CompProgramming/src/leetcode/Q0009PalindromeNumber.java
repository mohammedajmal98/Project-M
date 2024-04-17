package leetcode;

import java.util.Scanner;

public class Q0009PalindromeNumber {

	public static void main(String[] args) {
		
		int sum  = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is palindrome: ");
		int num = sc.nextInt();
		int temp = num;
		
		while(num>0){
			int n = num%10;
			sum = (sum*10) + n;
			num = num/10;
		}
		
		if(temp==sum){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome Number");
		}
		
		sc.close();
		

	}

}
