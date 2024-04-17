
public class F6wrapperClasses {

	public static void main(String[] args) {
		
		// to object --> Integer.valueOf(x), new Integer(x)
		// to string --> Integer.toString(x), x.toString()[if 'x' is already an object]
		// to primitive --> x.intValue() [from Object], Integer.parseInt(x) [from String]
		
		
		//Primitive to Object and Object to Primitive
		int a = 567;
		Integer b = Integer.valueOf(a);   //primitive to object
		int c = b.intValue();             //object to primitive
		System.out.println(a+" "+b+" "+c);
		
		//Primitive to String and String to Primitive
		int d = 890;
		String e = Integer.toString(d);    //Primitive to String
		int f = Integer.parseInt(e);	   //String to Primitive
		System.out.println(d+" "+e+" "+f);
		
		//Object to String and String to Object
		Integer g = new Integer(123);
		String h = g.toString();			//Object to String
		Short i = Short.valueOf(h);			//String to Object
		Short j = new Short(h);				//String to Object
		System.out.println(g+" "+h+" "+i+" "+j);
	}

}
