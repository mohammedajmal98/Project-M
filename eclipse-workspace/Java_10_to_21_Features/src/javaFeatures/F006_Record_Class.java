package javaFeatures;

//Record simply eliminates the need to create private fields, public 
//getters, public constructor, toString(), equals(), hashcode()

/*1) private, final field for each piece of data
  2) getter for each field
  3) public constructor with a corresponding argument for each field
  4) equals method that returns true for objects of the same class when all fields match
  5) hashCode method that returns the same value when all fields match
  6) toString method that includes the name of the class and the name of each field and its corresponding value
*/
record Faculty (int age, String Name) {
	
}

public class F006_Record_Class {

	public static void main(String[] args) {
		Faculty faculty1 = new Faculty(25, "David");
		System.out.println(faculty1);

	}

}
