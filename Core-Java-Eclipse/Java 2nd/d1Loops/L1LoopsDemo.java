package d1Loops;

public class L1LoopsDemo {

	public static void main(String[] args) {
		//Loops in Java: for, while, do while
		//i-iterator
		
		int f,g,h;
		f=g=h=6;
		System.out.println(f+g+h);
		
		for(int i=1; i<=5&&i>=1; i++){         //(Initialization, Condition, Increment/Decrement)
			System.out.print(i);
		}
		
		// System.out.println(i); //As 'i' is declared inside loop, It can't be accessed outside
		// 'i' will print '6' if it is declared outside
		System.out.println();
		int i = 6;
		for(; i<=10; i++){
			System.out.print(i);
		}
		
		System.out.println();
		for(int a=1,b=6; a<=5 && b<=10; a++,b++){
			System.out.print(a+" "+b+" ");
		}
	}

}
