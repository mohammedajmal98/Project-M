package oops;

class Abc {                  // can use "abstract class" here and make this method as "abstract"
	void worked(){
		System.out.println("Nothing");
	}
}

class Play extends Abc {
	void worked() {
		System.out.println("Playing");
	}
}

class Work extends Abc{
	void worked() {
		System.out.println("Working");
	}
}


class Do{
	void done(Abc a) {           //passing object of "Abc" as parameter
		a.worked();
	}
}



public class MethodObject {

	public static void main(String[] args) {
		
		Do demo = new Do();
		Work w = new Work();   // can also create with 'Abc' reference
		Abc p = new Play();
		
		Abc ab = new Abc();
		
		demo.done(w); //in order to pass 'w' as parameter, we need to create an object of Work
		demo.done(p);
		
		demo.done(ab);
	}

}
