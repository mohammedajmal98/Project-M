package dsa;

public class Q0202_Happy_Number {
	
	public static boolean isHappy(int n) {
		String num = Integer.toString(n);
		int value = 0;
		for(int i=0; i<num.length(); i++){
			value += (Character.getNumericValue(num.charAt(i)) * Character.getNumericValue(num.charAt(i)));
			System.out.println(value);
		}
		if(value==1){
			return true;
		}
		else if(value <= 6){
			return false;
		}
		else{
			return isHappy(value);
		}
    }

	public static void main(String[] args) {
		System.out.println(isHappy(111111));
	}
}
