class Addition {
	public void add(){
		System.out.println("Add two numbers");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, int b) {
		System.out.println(a/b);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		obj.add();
		obj.add(3,4);
		obj.add(3.4,4);
		
		

	}

}
