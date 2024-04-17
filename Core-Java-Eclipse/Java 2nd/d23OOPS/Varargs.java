package d23OOPS;

//Varargs --> Variable Length Arguments (If we don't know how many 'values' we'll get as arguments, we use it)
//'Varargs' introduced in SE 5.0

public class Varargs {
	
	//int... values must be the last parameter
	//Only one 'varargs' as parameter is allowed for one method
	static int minValue(String s, char c, int... values){ //store as an 'integer' array
		int min = Integer.MAX_VALUE;   // to store the 'maximum' value of the 'integer' to compare with others
		for(int k: values){
			if(k<min){
				min = k;
			}
		}
		return min;
	}
	//we can overload 'varargs' method as well
	
	static double minValue(String s, char c, double... values){ //store as an 'integer' array
		double min = Double.MAX_VALUE; // to store the 'maximum' value of the 'integer' to compare with others
		for(double k: values){
			if(k<min){
				min = k;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		System.out.println(minValue("Hii",'d'));                   //With 'no' arguments
		System.out.println(minValue("Hii",'d',2,4,-1,-5.2,5,7));
		System.out.println(minValue("Hii",'d', 33));				  //with '1' argument
		
		System.out.println(minValue("Hello", 'd')); //will give preference to 'int' rather than 'double'

	}

}
