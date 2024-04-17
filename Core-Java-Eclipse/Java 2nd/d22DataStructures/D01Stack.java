package d22DataStructures;
//Stack (behind the scenes)

public class D01Stack {
	
	int s[] = new int[10];
	int tos;         //top of stack - tos
	
	D01Stack(){           //Constructor
		tos = -1;
	}
	
	//push method
	void push(int item){
		if(tos==9){
			System.out.println("Stack is Full");	
		}
		else{
			s[++tos] = item;     //pre increment 'tos' and update
		}
	}
	
	//pop method
	int pop(){
		if(tos>=0){
			return s[tos--];    // return 'tos' and post decrement
		}
		else{
			System.out.println("Stack is Empty");
			return -1;
		}
	}	
	
	
	public static void main(String[] args) {
		
		D01Stack s1 = new D01Stack();
		s1.push(5);
		s1.push(8);
		s1.push(97);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		//System.out.println(s1.pop());
		
		D01Stack s2 = new D01Stack();	
		System.out.println(s2.pop());
	}

}
