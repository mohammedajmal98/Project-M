package dsa;

import java.util.Arrays;

public class ArrayPlusOne {
	
	public static int[] plusOne (int[] digits){
		double value = 0.0d;
		
		for(int i=0; i<digits.length; i++){
			value = (value*10) + digits[i];
			System.out.println(value);
		}
		value = value+1;
		System.out.println(value);
		
		String strValue = Double.toString(value);
		System.out.println(strValue);
		
		int[] resultArray = new int[strValue.length()];
		
		char character;
		String string;
		
		for(int i=0; i<strValue.length(); i++){
			 character = strValue.charAt(i);
			 string = Character.toString(character);
			 resultArray[i] = Integer.parseInt(string);	 
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,7,6};
		int[] result = plusOne(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
	}

}
