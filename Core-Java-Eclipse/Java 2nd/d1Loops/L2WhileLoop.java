package d1Loops;

public class L2WhileLoop {

	public static void main(String[] args) {
		
		// while loop - Entry Controlled Loop
		// do while loop - Exit Controlled Loop (Atleast 1 time, loop will be executed even 'while' condition is failed)
		
		
		int i=1;                      //Need to initialize outside of 'while' loop (may stuck in infinite)
		while(i<=5){                  //only 'condition' is given near to 'while'
			System.out.print(i);
			i++;                      //If we don't give this, it may stuck into 'Infinite' loop
		}
		System.out.println();
		
		//do while loop
		
		int j=1;
		do {
			System.out.print(j);
			j++; 	
		}
		while(j<=5);
		
		
		
	}

}
