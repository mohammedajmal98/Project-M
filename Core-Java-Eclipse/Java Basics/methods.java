// can't call non-static method from static method(eg:main etc.,). Need to create Object to call non-static method (or)
// can call non-static method from non-static method

public class methods {

	public static void main(String[] main) {
		methods obj = new methods();
		obj.left(9,123);

	}
	
	void left(int a, int b){
		System.out.println(a+b); 
		right(10,2);
	}
	
	void right(int a, int b){
		System.out.println(a-b);
	}

}
