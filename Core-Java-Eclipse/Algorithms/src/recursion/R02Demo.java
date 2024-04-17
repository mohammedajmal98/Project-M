package recursion;

public class R02Demo {
	
	static int count = 0;
	
	private static void demo(){
		count++;
		System.out.println("Hi! from " + count);
		if(count<10){
			demo();
		}
	}

	public static void main(String[] args) {
		demo();
	}

}
