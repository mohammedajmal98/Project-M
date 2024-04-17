package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.eat();
		
		Dog myDog = new Dog();
		myDog.eat();
		
		Animal myDog2 = new Dog();
		myDog2.eat();
		myDog2.eat(8);

	}

}
