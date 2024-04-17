public class F3typeConversion {

	public static void main(String[] args) {
		
		byte b = 43;
		int n = b;
		System.out.println(n);
		
		int k = 129;
		byte l = (byte) k;
		System.out.println(l);
		
		char c = 'A';
		int a = c;
		System.out.println(a);
		
		float e = 33.99f;
		short f = (short)e;
		System.out.println(f);
		
		int g = 34;
		double h = g;
		System.out.println(h);
	}
}
