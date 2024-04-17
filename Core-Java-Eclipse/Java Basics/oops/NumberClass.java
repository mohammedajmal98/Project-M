package oops;

class Printer {
	
	//Instead
//	public void show(Integer i){
//		System.out.println(i);
//	}
//	public void show(Double d){
//		System.out.println(d);
//	}
	
	//use
	public void show(Number i){     //Number is a class which is extended by Integer,Float,Double (Wrapper classes) etc.,
		System.out.println(i);
	}
}

public class NumberClass {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.show(5.5);

	}

}
