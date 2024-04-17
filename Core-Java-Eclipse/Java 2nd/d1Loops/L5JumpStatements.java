package d1Loops;

import java.util.Scanner;

public class L5JumpStatements {

	public static void main(String[] args) {
		//Jump Statements ==>Loop Control Statements (break,continue)
		//break --> It comes out of the entire loop(current loop) ('break' can't be used in 'if' statements)
		// 'break' only used in 'switch' and 'loops'
		// If current loop is inner loop, break will only come out of that loop, Outer loop will continue execution
		//refer 'labelled loops' for more
		
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers (enter negative number to stop):\n");
		
		while(true){			//It's like 'infinite loop' but "break" statement stops the loop if condition met
			n = sc.nextInt();
			if(n<0){
				break;
			}
			sum+=n;	
		}
		System.out.println("Sum is " + sum);
		sc.close();
		
		//continue --> skips the current iteration(code below 'continue') and continue the loop(next iteration)
		
		for(int i=1; i<=5; i++){
			if(i==3)
				continue;
			System.out.print(i);
		}
		
		
		
		
		
		
		
		
	}

}
