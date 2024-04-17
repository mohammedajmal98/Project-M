package generics;

//But, what if we need to print "Double value" or a "String Value". We need to create a separate class
//for that. To avoid Code duplication, we have "GENERICS" in Java.

//Generics offers us the ability to have one class that is flexible for many different types

class IntegerPrinter{
	Integer value;
	
	public IntegerPrinter(Integer value){
		this.value = value;
	}
	
	public void printValue(){
		System.out.println(value);
	}
}

public class G01_Integer_Printer {

	public static void main(String[] args) {
		IntegerPrinter printer = new IntegerPrinter(25);
		printer.printValue();
	}

}
