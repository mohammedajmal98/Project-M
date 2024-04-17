package important75LeetCode;
//Reverse Vowels of a String

import java.util.Stack;

public class Q0345ReverseVowels {
	
	public static String reverseVowels(String s) {
		Stack<Character> stack = new Stack<>();
	
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
			s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
				stack.push(s.charAt(i));
			}
		}
		
		char[] result = s.toCharArray();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
				result[i] = stack.pop();
			}
		}
		
		String finalResult = new String(result);
		
        return finalResult;
    }

	public static void main(String[] args) {
		String test = "lEetcode";
		System.out.println(reverseVowels(test));
	}
}
