package d20PassingObjects;
//call by value[only sending value not its variable/reference] (vs) call by reference
/*
 * In Memory, specific memory is allocated to 'main method()'. Likewise, specific memory is allocated for
 * every method and deallocated once it is completed. All methods and varaibles are stored in
 * 'Stack Memory'
 * 
 * In Memory, whenever we create objects using 'new' keyword, object is stored in 'Heap Memory'. It is
 * 'dynamic memory allocation'
 * 
 * Call by Reference:
 * Whenever 'Object' passed as 'Arguments', it passes 'Reference'(Memory location of base object)
 * 
 * Call by Reference:
 * Whenever 'Primitive Datatypes' passed as 'Arguments', it passes 'Value' not 'References'
 * 
 * 
 */


class callByValueDemo{
	static void increment(int a){   //'a' is just the name used to receive the value. 'a'!='a'
		a++;						//this 'a' is 'local variable'
	}
	public static void main(String args[]){
		int a = 1;
		increment(a);
		System.out.println(a);      //'a' is not incremented
	}
}




