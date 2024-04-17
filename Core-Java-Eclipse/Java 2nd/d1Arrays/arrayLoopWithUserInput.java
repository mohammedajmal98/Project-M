package d1Arrays;

import java.util.Scanner;

public class arrayLoopWithUserInput {
	
	//Using 'For' Loop and 'For Each' Loop to store and retrieve array elements

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Size: ");
		
		//using 'for' Loop
//		int a[] = new int[5];
//		for(int i=0; i<a.length; i++){
//			a[i]=sc.nextInt();
//			//System.out.println(a[i]);	
//		}
//		for(int i=0; i<a.length; i++){
//			System.out.print(a[i] + " ");	
//		}
		
		
		//using 'for each' loop
		int count = sc.nextInt();
		int b[] = new int[count];    //getting input for 'Array' Size
		
		System.out.println("Enter the numbers: ");
		int n=0;
		
		for(int i : b){
			b[n]=sc.nextInt();
			n++;
		}
		for(int j: b){
			System.out.print(j);	
		}
		
		
		sc.close();
	}
}
