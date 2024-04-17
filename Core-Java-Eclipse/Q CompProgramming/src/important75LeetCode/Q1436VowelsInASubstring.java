package important75LeetCode;

public class Q1436VowelsInASubstring {
	
	public static int maxVowelInASubString(String s, int k){
		
		int max = 0;
		int count = 0;
		
		for(int i=0; i<s.length()-k; i++){
			count = 0;
			for(int j=i; j<i+k; j++){
				if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' ||
				s.charAt(j)=='u'){
					count++;
				}
			}
			if(count>max){
				max = count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "abciddef";  //output: 3       (or) s = "aeiou", k = 2, Output:2
		int k = 3;
		System.out.println(maxVowelInASubString(s,k));
	}
}
