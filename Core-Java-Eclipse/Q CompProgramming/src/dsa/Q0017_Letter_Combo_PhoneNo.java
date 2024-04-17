package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q0017_Letter_Combo_PhoneNo {
	
	public static List<String> letterCombinations(String digits) {
        List<String> letterCombosList = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");	 map.put(3, "def");		 map.put(4, "ghi");		 map.put(5, "jkl");
        map.put(6, "mno");	 map.put(7, "pqrs");	 map.put(8, "tuv");		 map.put(9, "wxyz");
        
        for(int i = 0; i<digits.length(); i++){
           String current = map.get(digits.charAt(i));
           
           
           
        }

        return letterCombosList;
        
    }

	public static void main(String[] args) {
		String digit = "23";
		System.out.println(letterCombinations(digit));
	}

}
