package generics;

class MultipleGenerics <T,V>{
	T value;
	V result;
	
	public MultipleGenerics(T value, V result) {
		this.value = value;
		this.result = result;
	}
	
	public void printValue(){
		System.out.println(value + " " + result);
	}
}

public class G04_Generic_Methods {
	
	//Let's create a method which'll take any type of Object and print it with "!!!!!"
	private static<T> void shout(T value){
		System.out.println(value + "!!!!!");
	}
	
	//Java also supports multiple diff generic types in Methods as well as Classes
	private static<T,V,S> void shout(T value, V result, S extra){
		System.out.println(value + "" + result + "%%%%%");
	}
	//Instead of void, we can also mention return type. If 'T' is the return type, just add T
	private static <T,V> T shout(T value, V result){
		return value;
	}

	public static void main(String[] args) {
		shout(44);
		shout("Hahaha");
		shout(new Cat()); //prints memory location or toString method. Cat presents in G03
		
		shout(44,"Happy",55); //Multiple Generics in method
		
		MultipleGenerics<Integer, String> check = new MultipleGenerics<>(77, "Happy");
		check.printValue();	//Multiple Generics in Class
		
		System.out.println(shout("Just print me", 22)); //Multiple generics with return type T
		
		
	}

}
