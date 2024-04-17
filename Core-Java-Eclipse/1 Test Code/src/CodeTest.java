
public class CodeTest {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println();
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken is " + (end-start) + " ms");
		
		System.out.println(start);
		System.out.println(end);
		
		
		
		

	}
}
