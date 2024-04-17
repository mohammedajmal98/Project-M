
//enum -> used to define/represent a group of constants
// BEGINNER("abbreviation") -> Here itself, an Object is created and "B" is passed through the constructor as String
// Constants should be in "Capital" letters. (Constants are Public, Static and Final)
// enum cannot be used to create Objects & it cannot extend other classes but it can implement interfaces
// Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc
// An enum can, just like a class, have attributes and methods
// Can also have "enum" inside a class
// Can also loop through "enum" constants using .values() method

enum Level{		// "enum" is a sub class of "Enum"(in java.lang.Enum)
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");
	
	private String abbr;				// can also mention "public"
	//Constructor
	Level(String ab){
		abbr = ab;
	}
	
	public String getAbbr(){
		return abbr;
	}
}


public class F12Enum {

	public static void main(String[] args) {
		Level l1 = Level.ADVANCED;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		
		//some methods of Enum class (Super class) -> valueOf, compareTo, toString, ordinal etc.,
		System.out.println(l1.toString());
		System.out.println(l1.ordinal());
	}

}
