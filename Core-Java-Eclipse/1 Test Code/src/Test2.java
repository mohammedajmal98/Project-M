
public class Test2 {
	public static void main(String[] args) {
		Animal a2 = new Tiger();
		a2.type();
		// a2.mySlang();	//only overridden methods are allowed to call via "Parent" reference
	}
}
class Animal{
	void type(){
		System.out.println("Animal type");
	}
}
class Tiger extends Animal{
	void mySlang(){
		System.out.println("Tiger ka hukumm....");
	}
}
