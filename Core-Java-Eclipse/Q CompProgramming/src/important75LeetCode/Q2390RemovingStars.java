package important75LeetCode;

public class Q2390RemovingStars {
	
	public static String removingStars(String s){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='*')
				sb.deleteCharAt(sb.length()-1);
			else
				sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String s ="leet**cod*e";		//output: lecoe
		System.out.println(removingStars(s));

	}

}
/* You are given a string s, which contains stars *.
In one operation, you can: Choose a star in s. Remove the closest non-star character to its left, as well as 
remove the star itself. Return the string after all stars have been removed.
*/
