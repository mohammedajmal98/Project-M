package leetcode;

public class Q0012IntegerToRoman {

	public static void main(String[] args) {
		//Input limit 1<num<4000
		// I-1, V-5, X-10, L-50, C-100, D-500, M-1000
		// IV-4, IX-9, XL-40, XC-90, CD-400, CM-900
		
		System.out.println(intToRoman(90));
		
	}
	
	public static String intToRoman(int num){
		StringBuilder sb = new StringBuilder();
		
		int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		int i = 0;
		while(num>0){
			while(num>=numbers[i]){
				num -= numbers[i];
				sb.append(romans[i]);
			}
			i++;
		}
		
		return sb.toString();
		
	}

}
