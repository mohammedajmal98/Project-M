//this -> refers to the current object
//can use 'this' in any non-static methods and Constructors
//NOTE: 'this' is not allowed in any Static Method -> Because Static methods belongs to Class not for Objects

//Using 'this', we can call one constructor from another constructor
class Dog{
	
	private int age;
	private String name;
	
	
	public Dog(){
		//It must be the first statement of this Constructor
		this("defaultname", 10);	//prints default name
		//Set default value and call another constructor from this constructor and set the values
		//Can also use like below
//		name = "defaultName";
//		age = 10;
	}
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;	//can also use only 'name'. But using 'this.name' is the best practice
	}
	
	public int getAge(){
		return age;
	}
}

public class F003_this_keyword {

	public static void main(String[] args) {
		Dog myDog = new Dog("Mike", 12); //Initial setup
		myDog.setName("Bikee"); //Override the intial name set by Constructor
		System.out.println(myDog.getName());
		
		Dog myDog2 = new Dog();
		System.out.println(myDog2.getName() + " " + myDog2.getAge());//prints default name
	}

}
