package d20PassingObjects;

//Whenever we send 'Object' as 'Arguments' in methods/constructors, it only sends the reference(memory location)
//not its values

class Scale {
	int length;
	int breadth;
	int height;
	
	Scale(int l, int b, int h){                   
		length = l;
		breadth = b;
		height = h;
	}
	
	//return type is 'Scale' becauuse it returns 'Object' of Scale
	Scale doubling(){
		//this length denotes 'b1' length & it calls constructor(can also use temp.length = length)
		Scale temp = new Scale(2*length, 2*breadth, 2*height); //creates a temporary object to store values 
		length++; //just to check
		return temp;       //returns object 'temp' which will be stored in 'b2'		
	}	
}

public class P05ReturningObjects {

	public static void main(String[] args) {
		Scale b1 = new Scale(1,2,3); 
		System.out.println(b1.length + " " + b1.breadth + " " + b1.height);
		
		Scale b2 = b1.doubling();     //'b2' will store the values return from doubling method in 'b1'
		//Also, in 'b2' is not created seperately in Heap memory. 'b2' just has the reference of 'temp' object
		//and uses its values
		
		System.out.println(b2.length + " " + b2.breadth + " " + b2.height);
		
		System.out.println(b1.length);
	}
}
