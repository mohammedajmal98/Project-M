import java.util.StringJoiner;

//StringJoiner Class - Using this class we can join more than one strings with the specified delimiter, 
//we can also provide prefix and suffix to the final string while joining multiple strings.
//Methods - add(), merge(), setEmptyValue(), length(), toString()

public class J09_StringJoiner_Class {

	public static void main(String[] args) {
		//Example 1 - Adding delimiter
		StringJoiner example1 = new StringJoiner("-");
		example1.add("Hello");
		example1.add("Boys");
		System.out.println(example1);
		
		//Example 2 - Adding delimiter, Prefix and Suffix
		StringJoiner example2 = new StringJoiner("/", "Hai(", ")Bye");
		example2.add("Mass");
		example2.add("Class");
		System.out.println(example2);
		
		//Example 3 - Merging two StringJoiner Objects
		StringJoiner example3 = new StringJoiner("-", "pre", "suf");
		example3.add("Hello");
		example3.add("Boys");
		StringJoiner mergedStrings = example3.merge(example2);
		System.out.println(mergedStrings);
		
//		Merging both the strings  
//		 * The important point to note here is that the output string will be 
//		 * having the delimiter prefix and suffix of the first string (the string
//		 * which is calling the merge method of StringJoiner)
		
		
		//Example 4 - setEmptyValue(), length() and toString() methods
//setEmptyValue() -> Set default value if the StringJoiner instance is Empty
//length() -> Gives length of characters including space, delimiter etc.,
//toString() -> converting a StringJoiner instance to a String.
		
		StringJoiner mystring = new StringJoiner(",");   
        mystring.setEmptyValue("This is a default String");  
        System.out.println("Default String: "+mystring);  
          
        mystring.add("Apple");  
        mystring.add("Banana"); 
        mystring.add("Orange");
        mystring.add("Kiwi");
        mystring.add("Grapes");
        System.out.println(mystring);  
          
        int length = mystring.length();  
        System.out.println("Length of the StringJoiner: "+length);  
        
        String s = mystring.toString();  
        System.out.println(s); //String
	}
}
