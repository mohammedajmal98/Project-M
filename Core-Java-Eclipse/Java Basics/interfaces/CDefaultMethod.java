package interfaces;

interface Cde{
	void show(); //can also use Functional Interface through Lambda expreesion
	
	default void play() {         //These default methods can be overridden in class which implements this interface
		System.out.println("Playing");
	}
	default void sing() {
		System.out.println("Singing");
	}
}

class Xyz implements Cde {
	public void show() {
		System.out.println("Showing");
	}
}

public class CDefaultMethod {

	public static void main(String[] args) {
		
		Cde obj = new Xyz();
		obj.show();
		
		obj.play();
		obj.sing();
		

	}

}
