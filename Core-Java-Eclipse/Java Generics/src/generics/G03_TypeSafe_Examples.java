package generics;

//Type Safe
//	ArrayList<Cat> cats = new ArrayList<>();
//	cats.add(new Cat());
//	cats.add(new Dog()); //Can't add Dog() as it's type is Cat mentioned in ArrayList<Cat>
//	Cat myCat = cats.get(0);

/*  Can we make it as ArrayList<Object> to make it accept any Object like Cat, Dog etc.,??
 * 		Yes, we can do. BUT, it won't be type safe at all
 * 
 * 	ArrayList<Object> cats = new ArrayList<>():
 * 	cats.add(new Dog());
 * 	Cat myCat = (Cat) cats.get(0); //will generate an error in runtime as it is dog object. 
 * 		(Cat) casting is used to convert it from Object to Cat
 * 
 */

//Instead of accepting any type <T>, we can be more specific in generic (BOUNDED GENERIC)
//Eg: <T extends Animal> -> Now, it only accepts the type of Animal class or its Child Class
class Animal{
	void eat(){
		System.out.println("Munch.. Munch...");
	}
}

class Cat extends Animal{

	@Override
	public String toString() {
		return "meow";
	}

	void eat(){
		System.out.println("Crunch...Crunch...");
	}	
}

class Dog extends Animal{
	
}

class AnimalPrinter <T extends Animal>{	//Bounded Generic - limit the generics
	
	T value; //Now in value, any method in Animal is available to value as it extends that class.
	
	public AnimalPrinter(T value){
		this.value = value;
	}
	
	public void printValue(){
		value.eat();
		System.out.println(value);
	}
	
}

public class G03_TypeSafe_Examples {

	public static void main(String[] args) {
		//AnimalPrinter<Integer> won't work as it is out of scope 
		AnimalPrinter<Cat> printer = new AnimalPrinter<>(new Cat());
		printer.printValue();
		
		AnimalPrinter<Dog> printer2 = new AnimalPrinter<>(new Dog());
		printer2.printValue();

	}

}

// <T extends Animal & Serializable> -> will work. Also, Java allows only one Class 
//		in Generic as Java doesn't support multiple inheritance & any no of interfaces (separated by '&')
// <T extends Serializable & Animal> -> Won't work. (Order is important. First Class then Interfaces)




