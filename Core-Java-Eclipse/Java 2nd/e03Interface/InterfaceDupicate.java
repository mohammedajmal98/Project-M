package e03Interface;

interface Son{
	default void relation(){
		System.out.println("I am your Son");
	}
}
interface Daughter{
	default void relation(){
		System.out.println("I am your Daughter");
	}
}
class Parent implements Son, Daughter{ //won't allow to implement same name default methods' Interfaces
	//so, we need to create a default method with same name and override here
	
	public void relation(){
		System.out.println("Both are our Children...");
	}	
}

public class InterfaceDupicate {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.relation();
	}

}
