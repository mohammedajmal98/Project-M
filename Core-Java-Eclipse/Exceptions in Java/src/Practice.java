
public class Practice {

	public static void main(String[] args) {
		System.out.println("j"+'a'+'v'+'a'); //add "double quotation" to avoid 'char' acts as ASCII values
		
		Integer a = 1;
		Integer b = 1;
		Integer c = new Integer(1); // creating an object using "new" will create separate memory space
		
		//For 'Integer', the value from -128 to +127 points to the same memory location. After this range,
		//It points to diff. memory location
		
		System.out.println(a==b);   //same 'content' as well as same 'memory' (from -128 to	+127) so it is true
		System.out.println(a==c);   //same 'content' but different 'memory' location
		
		Integer d = 1000;
		Integer e = 1000;
		
		System.out.println(d==e);   //same 'content' but diff memory(from -128 to +127) so it is false

	}

}
