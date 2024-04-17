
public class F7UnaryIncDec {

	public static void main(String[] args) {
		
		//Increment --> ++x (pre), x++ (post)
		//Decrement --> --x (pre), x-- (post)
		
		long x = 10;
		float y = ++x;              // replace it with x++, --x, x--
		System.out.println(x+" "+y);

		// b<s<c<i<l<f<d
		int a = 1;
		int b = a++ + ++a * --a - a--;  // (1+3*2-2) = 5
		System.out.println(b);
		
		// a=11++ --> Constants can't be incremented/decremented. Only variables allowed to ++/--
		
		//NOTE:   (a^b)^a = b and (a^b)^b = a
	}

}
