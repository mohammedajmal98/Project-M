package recursion;

//Java stores all methods in "Call Stack" (eg: When a main() method is called, Java puts all the information
//for the main method onto the call stack -> Information includes name of the method, references to any
//variables that were passed in etc.,

//main method is at the bottom of the call stack (which starts first and finishes execution 
//finally and get removed from the stack -> Program ends!!!)
// methods add at the top of the call stack and get removed from once it finishes its execution

//Condition - 1 -> Need a base case
//Condition - 2 -> Our code need to move/progress towards the base case to stop the recursion

public class R00Introduction {
	
	public static void main(String[] args) {
		sayHi(5);
	}
	
	public static void sayHi(int count){
		if(count <= 0){	//Base Case
			return;
		}
		
		System.out.println("Hii!!");
		sayHi(count - 1);	//Code that progress towards the base case
	}

}
