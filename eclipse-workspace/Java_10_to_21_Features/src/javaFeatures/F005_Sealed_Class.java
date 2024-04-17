package javaFeatures;

//Is-A relationship -> Inheritance eg: Car is a Vehicle (Not 'Person is a vehicle)
//		Where One class extends another class.
//Has-A-relationship -> Association(Person has a Car)
//  Where One class instance/object is created in another class to use.
//	Types of Association: (one-one, one-many, many-one, many-many)
//		- Aggregation(can function individually - Weak Association), 
//		- Composition(highly dependent on each other - Strong Association)
//	

//Sealed Class -> Works as Final class but it allows some classes only 
//to extend it

public class F005_Sealed_Class {

	public static void main(String[] args) {

	}

}
//Now only permits Car, Bike class to extend && Permitted Classes must 
//extend this Parent Class
sealed class Vehicle permits Car, Bike{
	
}
//The issue is we have to mention 'final' or 'non-sealed' before the 
//permitted classes
non-sealed class Car extends Vehicle{
	
}
//Now, Bike can't be extended by any Class
final class Bike extends Vehicle{
	
}
//Sealed - Restricted permission to specific classes
//non-sealed - Any class can extend it
//final - can't be extended by any Class
class Person {
	
}
