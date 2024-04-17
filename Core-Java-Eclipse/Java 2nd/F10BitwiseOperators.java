
public class F10BitwiseOperators {

	public static void main(String[] args) {
		
		int a = 4, b = 6;
		
		// a = 0000 0100
		// b = 0000 0110
		
		System.out.println(a&b);  //Bitwise AND
		System.out.println(a|b);  //Bitwise OR
		System.out.println(~a);   //Bitwise NOT
		System.out.println(a^b);  //Bitwise XOR --> Exclusive OR = Strictly OR
		
		
		System.out.println(a<<1); //Bitwise Left Shift -->Value will be increased mostly
		System.out.println(a>>1); //Bitwise Right Shift -->Value will be decreased mostly
		
		int c=127;                 // c= 0111 1111
		System.out.println(c>>>1);
		//Bitwise Right Shift Zero Fill --> fill only '0' on vacant positions on right shift
		//Normally, vacant positions filled in R.S. according to 'sign' of the number
		//1 for negative, 0 for positive

	}

}
