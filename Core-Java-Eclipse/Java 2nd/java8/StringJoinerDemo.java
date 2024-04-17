package java8;
//StringJoiner class - we can join more than one strings with the specified delimiter, 
//we can also provide prefix and suffix to the final string while joining multiple strings
//StringJoiner also have some useful methods such as add(), merge(), setEmptyValue(), length(), toString()

//Delimiter should be given (atleast space or nospace with double quotes) bcoz its constructor is designed in that way

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner myString = new StringJoiner("-");	// '-' is the delimiter
		myString.add("Hello");		//add() method
		myString.add("Earth");
		System.out.println(myString);
		
		StringJoiner ourString = new StringJoiner("-","[","]");	//'-' as delimiter, '[' as Prefix, ']' as Suffix
		ourString.add("Hello");
		ourString.add("Earth");
		System.out.println(ourString);
		
		//setEmptyValueMethod()
		StringJoiner theirString = new StringJoiner("");
		theirString.setEmptyValue("Hello, a member of the Solar System");
		System.out.println(theirString);
		//length()
		System.out.println(theirString.length() + " " + myString.length());
		//toString() - used for converting StringJoiner instance to a String
		String str = myString.toString();
		System.out.println(str);
		
		
		
	}

}
