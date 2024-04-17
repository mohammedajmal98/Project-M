package e07WrapperClasses;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i = 10;
		
		Integer i2 = Integer.valueOf(15);
		
		Integer i3 = Integer.valueOf(i);	//Boxing, Wrapping (Primitive to Object)
		
		int i4 = i2.intValue();				//Unboxing, Unwrapping (Object to Primitive)
		
		Integer i5 = 28;					//Autoboxing -> Compiler internally uses Integer.valueOf(28)
		
		int i6 = i5;						//AutoUnboxing -> Compiler internallu uses i5.intValue()
		
		System.out.println(i + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5);
		
		//Integer Class has a static method called "parseInt()" method which is useful for converting
		//String to int
		
		String s = "123";
		char c = 'A';
		
		int j = Integer.parseInt(s);
		int j2 = c;						//No need of parseInt()
		double j3 = Double.parseDouble(s);
		
		System.out.println(j + 1);
		System.out.println(j2);
		System.out.println(j3);	
		
		//toString can be used to convert back to 'String'
		//Integer to String
		String str = Integer.valueOf(j).toString();
		System.out.println(str + 1);
		
		//String to Integer
		Integer objectInt = Integer.valueOf(str);
		System.out.println(objectInt + 10);
		
		//If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods 
		//throw NumberFormatException. eg: String is "hello" but when you try to convert this to int, this error occurs
	}
}
