package d1ObjectsClassesMethodsEtc;

public class O3Constructor {
	
	//method with same class name --> Constructor 
	//Immediately called when the 'object' is created
	//No return type, Used for initializing the values
	
	int a,b,c;   //If we make it as 'static', the value of variable sticks to its last update(even from any object)
	
	O3Constructor(int x, int y, int z){
		a = x;                              //can also use 'this' if we want use same name for parameters
		b = y;								//'this' refers to the current object
		c = z;								//'this' is used to denote 'instance variable'
	}
	
	O3Constructor(){
		System.out.println("I'm from nothing");
		a = 10;
	}

	public static void main(String[] args) {
		
		O3Constructor obj1 = new O3Constructor(1,2,3);
		System.out.println(obj1.a + obj1.b + obj1.c);
		
		O3Constructor obj2 = new O3Constructor();
		System.out.println(obj2.a + obj2.b + obj2.c);
		
		// System.out.println(a + b + c); //check this with 'static' in variable		

	}

}
