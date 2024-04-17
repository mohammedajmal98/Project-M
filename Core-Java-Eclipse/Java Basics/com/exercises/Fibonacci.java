package com.exercises;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int count = sc.nextInt();
		
		sc.close();
		
		
		int n1=0, n2=1, n3, sum=1;
		System.out.print(n1+" "+n2);
		
		
		
		for(int k=2; k<count; ++k){
			n3 = n1+n2;
			System.out.print(" " + n3);
			
			
			n1=n2;
			n2=n3;
			
			sum+=n3;
			
			
		}
		System.out.println();
		System.out.println(sum);

	}

}
