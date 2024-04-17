
public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("inside main1");
		StaticMethodsDemo.method1();
	}

	static void method1() {
		System.out.println("inside method1");
	}

	static {
		StaticMethodsDemo.method1();
		System.out.println("inside main1");

	}
}
//static block executes first then main method then method1
