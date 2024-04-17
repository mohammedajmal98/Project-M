package generics;

//NOTE: Generics don't work with Primitive datatypes. Use Wrapper Classes instead.
//We can see generics when using Collections

class Printer <T>{	//Can use anything inside <Anything>, instead of <T>. But, <T> is normally used
	// T represents Type of thing that this Printer is going to hold
	T value;
	
	public Printer(T value){
		this.value = value;
	}
	
	public void printValue(){
		System.out.println(value);
	}
}

public class G02_Printer {

	public static void main(String[] args) {
		Printer<Integer> printer = new Printer<>(18);
		printer.printValue();
		Printer<String> printer2 = new Printer<>("Eighteen");
		printer2.printValue();
		
		//Type Safe
//		ArrayList<Cat> cats = new ArrayList<>();
//		cats.add(new Cat());
//		Cat myCat = cats.get(0);

	}

}
