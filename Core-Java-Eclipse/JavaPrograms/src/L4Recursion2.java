
public class L4Recursion2 {
	
	static int recurse(int n){
		if(n<=1)
			return n;
		return recurse(n-1) + recurse(n-2);
	}

	public static void main(String[] args) {
		System.out.println(recurse(6));
	}
}

/* Explanation:
 * recurse(n-1) + recurse(n-2) = recurse(5) + recurse(4)
 * recurse(5) = recurse(4) + recurse(3) = recurse(3) + recurse(2) + recurse(2) + recurse(1) =
 * recurse(2) + recurse(1) + recurse(1) + recurse(0) + recurse(1) + recurse(0) + 1 =
 * 1 + 1 + 1 + 1 + 1 = 5 --> recurse(5)
 * 1 + 1 + 1 = 3 --> recurse(4) 
 */

