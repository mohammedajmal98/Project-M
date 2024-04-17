package javaRegex;

/*Regular expressions are used for defining String patterns that can be used for searching, manipulating 
 * and editing a text.
 * 
 * 	".*" -> allows zero or more characters (we used this in the example 'book' on both sides)
 * 
 *  java.util.regex.Pattern – Used for defining patterns.
 *  	Pattern.matches() -> to search the pattern in the given text
 *  		This way we can search a single occurrence of a pattern in a text. For matching multiple occurrences 
 *  		you should use the Pattern.compile() method.
 *  	
 *  	Pattern.compile() ->
 *  
 *  	Pattern.matcher() ->
 *  
 *  	Pattern.split() ->
 *  
 *  
 *  java.util.regex.Matcher – Used for performing match operations on text using patterns.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
	public static void main(String[] args) {
		
		String content = "Hi guys, this is " + "my book, actually";
		String myPattern = ".*book.*";
		
		boolean isMatch = Pattern.matches(myPattern, content); 	
		System.out.println(isMatch);
		
		
		
		
		
		
		
		
		System.out.println("Regex done...");

	}

}
