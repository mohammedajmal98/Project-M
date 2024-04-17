package tester;

//Unit Testing - It is a type of software testing where one individual
//piece of code or unit is being tested by itself (Unit test isolates 
//one single piece of code and verifies that piece(even Class or a single
//method in Java) is working correctly

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tester1 {
	
	public static List<String> letterCombinations(String digits) {
        List<String> letterCombosList = new ArrayList<>();

        Map<Integer, String> num = new HashMap<>();
        		num.put(2, "abc");
        		num.put(3, "def");
        		num.put(4, "ghi");
        		num.put(5, "jkl");
        		num.put(6, "mno");
        		num.put(7, "pqrs");
        		num.put(8, "tuv");
        		num.put(9, "wxyz");
        		
        //System.out.println(digits.length());
        String current2 = num.get(Character.getNumericValue(digits.charAt(0)));
        System.out.println(current2);
        for(int i = 0; i<digits.length(); i++){
           String current = num.get(digits.charAt(i));
           StringBuilder sb = new StringBuilder();
           if(digits.length()==1) {
        	   sb.append(Character.toString(current.charAt(i)));
           }
           letterCombosList.add(sb.toString());
           
           
        }

        return letterCombosList;
        
    }

	public static void main(String[] args) {
		System.out.println(letterCombinations("3"));
	}

}
