package interfaces;

//Functional Interface must have one abstact method but can have many default or static methods

// can use this annotation @FunctionalInterface
interface Bcd {
	void show();
}

public class BFunctionalInterface {

	public static void main(String[] args) {

		//same concept as "AnonymousInnerClasInterface". Here, solved using "Lambda expression"
		
		Bcd obj = () -> System.out.println("hiiiiiii");   //Lambda Expression

		obj.show();

	}

}
