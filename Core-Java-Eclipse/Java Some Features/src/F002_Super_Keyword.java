
//Super - It is used to access things in the parent class of the working class.
//Super Keyword can't be used to access any Private methods or fields in the parent class.

//Two main ways that we can use Super keyword in Classes
// 1st way -> use Super keyword to call methods in Parent Class in Overridden method/or any method if needed
// 2nd way -> use Super keyword by calling parent class constructors
		//It can only be used inside sub class constructors
		//Also, It has to be the first line of the Constructor definition
		//Super() -> parent class no-arg constructor is called implicitly by Java if nothing is mentioned in Sub-class constructor

class Animal{
	int age;
	String name;
	
	public Animal(){
		
	}
	
	public Animal(int age, String name){
		this.age = age;
		this.name = name;
	}
	public void makeNoise(){
		System.out.println("I am an Animalllll.....");
	}
}

class Cat extends Animal{
	String breed;
	
	public Cat(int age, String name, String breed){
		super(age, name);	//2nd Way - use Super keyword by calling parent class constructors with 
//appropriate matching parameters in the parent class.
		//No need to mention below code
//		this.age = age;
//		this.name = name;
		this.breed = breed;
	}
	
	@Override
	public void makeNoise(){
		super.makeNoise();	
//1st way -> Only need the Super keyword when we specifically want the parent classes implementation
//of a method that we have overridden in the subclass
		System.out.println("meow... meow... meow...");
	}
}

public class F002_Super_Keyword {

	public static void main(String[] args) {
		Cat cat = new Cat(4, "Bite", "Shepherd");
		cat.makeNoise();
	}

}
