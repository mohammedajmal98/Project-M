package javaFeatures;

public class F004_String_Template {

	public static void main(String[] args) {
		int i = 9;
		int j = 8;
		
		//Instead of
		System.out.println(i + " + " + j + " = " + (i+j));
		
		//we can use below code (but supports only in JDK 21 & above
//		System.out.println(STR."\{i} + \{j} = \{i+j}");
	}

}
