package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q0013RomanToInteger {
	
	public static int romanToInteger (String s){
		Map<Character, Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V', 5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int n = 0;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			
			if(i+1 < s.length()  &&  map.get(s.charAt(i+1)) > map.get(c)){
				n += map.get(s.charAt(i+1)) - map.get(c);
				i+=1;	//double increment "i"
			}
			else{
				n += map.get(c);
			}
		}
		return n;
	}

	public static void main(String[] args) {
		
		String s = "XLLXMD";   // 40 + 50 + 990 + 500 also written as "MDLXXX"
		System.out.println(romanToInteger(s));
	}
}
