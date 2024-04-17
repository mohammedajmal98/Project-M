package leetcode;

public class Q0003LongestSubstringWithoutRepeatingCharacters {

	// given a string s, find the length of the longest substring without
	// repeating characters
	// eg: input: "pwwkew" output: 3. Answer is 'wke'

	public static void main(String[] args) {
		String s = "pwwkew";
		String add = "";
		int length = 0;
	
		System.out.println(s.length());
		
		for(int i = 0; i<s.length(); i++){
			add = "";
			for(int j = i; j<s.length(); j++){
				if(add.contains(Character.toString(s.charAt(j)))){
					break;
				}
				add += s.charAt(j);
			}
			System.out.println(add);
			if(add.length()>length){
				length = add.length();
			}
		}
		System.out.println(length);
	}
}
