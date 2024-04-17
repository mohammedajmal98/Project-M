import java.util.Optional;

//Optional class - java.util package
/*This class is introduced to avoid NullPointerException that we frequently encounters if we do not 
 * perform null checks in our code. Using this class we can easily check whether a variable has null 
 * value or not and by doing this we can avoid the NullPointerException.
 * 
*/

//Optional - is a container that either has something in it or doesn't have anything.
// Optional is like a container where it stores the value if it is present otherwise it returns an empty container


public class J10_Optional_Class {

	public static void main(String[] args) {
//		Cat myCat = findCatByName("John");
		Optional<Cat> optionalCat = findCatByName("Johnson");
		
		if(optionalCat.isPresent()){
			System.out.println(optionalCat.get().getName() + " " + optionalCat.get().getAge());
		}
		else{
			System.out.println(0);
		}
		
		optionalCat.orElse(new Cat("Khan", 10));	
		//return Value if it is otherwise it return this value (kind of default value)
		
		optionalCat.map(Cat::getAge).orElse(0);	//return age if value is there, otherwise returns '0'
		
		System.out.println(optionalCat.get().getName());
		
	}
	
//	private static Cat findCatByName (String name){
//		Cat cat = new Cat(name, 3);
//		return cat;	//If cat is null, it gives NullPointerException
//	}
	
	private static Optional<Cat> findCatByName (String name){
		Cat cat = new Cat(name, 3);
//		return Optional.ofNullable(cat);
		return Optional.ofNullable(null);
	}

}

class Cat{
	String name;
	int age;
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
