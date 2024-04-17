package important75LeetCode;
import java.util.Arrays;
//is 's' a part of 't' in the same order
public class Q0392IsSubsequence {
	
	public static boolean isSubsequence(String s, String t){
		int n=0;
		char[] arr = new char[s.length()];
		
		if(s.length()>t.length()){
			return false;
		}
		
		for(int i=0; i<s.length(); i++){
			for(int j=n; j<t.length(); j++){
				if(s.charAt(i)==t.charAt(j)){
					arr[i]=t.charAt(j);
					n=j;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
		
		String test = new String(arr);
		if(test.equals(s)){
			return true;
		}
		return false;	
	}

	public static void main(String[] args) {
		String s = "aabbc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s,t));
	}
}
