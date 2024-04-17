//Constructor - special type of method that is used to create new Objects

//	Dog myDog = new Dog(); this 'Dog() actually calling the Dog constructor method to create a new Object
// Also, Java creates 'Default Constructor (no-arg)" for us even if we don't create any constructor

//Can create Multiple Constructors -> But should have different types/number of parameters

//NOTE: If we don't provide any Constructor, Java will provide default no-arg constructor. But, if we
//specify any Constructor, we must specify default one too if we need that (bcoz Java won't provide) 

//If we need to prevent someone creating Objects, we can set Constructor to 'private'
public class F004_Java_Constructors {

	public static void main(String[] args) {
		Dog2 myDog = new Dog2();
		System.out.println(myDog.name);
		
		System.out.println(args[0]);	//Just a check for calling main() from another class main()
	}

}

class Dog2{
	String name;
	int age;
	Dog2(){
		//can set the default value for name alone
		name = "Kabali";
		//age = 15;
	}
}
