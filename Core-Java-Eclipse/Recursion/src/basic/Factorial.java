package basic;

/*	5! = 5*4*3*2*1 = 5*4!
 *  4! = 4*3!, So, n! = n * (n-1)!	(Applicable for above 0)
 * 
 * 
 */

public class Factorial {
	
	static int fact(int n){
		if(n==0){	// End/Base Condition
			return 1;
		}
		return n * fact(n-1);
		/* 5 * fact(4)
		       4 * fact(3)
		           3 * fact(2)
		               2 * fact(1)
		                   1 * fact(0)
		                   1 * 1
		               2 * 1
		           3 * 2
		       4 * 6
		   5 * 24
		 				(Answer: 120)
		   */
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
	}

}
