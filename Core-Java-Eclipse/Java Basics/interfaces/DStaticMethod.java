package interfaces;

interface Def{
	void show();      //can also use Functional Interface through Lambda expreesion
	
	static void play() {         //directly access using interface name. static does not need any class objects to implement.
		System.out.println("Playing");
	}
	static void sing() {
		System.out.println("Singing");
	}
}

class Wxy implements Def {
	public void show() {
		System.out.println("Showing");
	}
}

public class DStaticMethod {

	public static void main(String[] args) {
		
		Def.sing();
		Def.play();
		
		Def obj = new Wxy();
		obj.show();	
	}
	
}
