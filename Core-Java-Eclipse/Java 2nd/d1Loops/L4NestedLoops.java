package d1Loops;

public class L4NestedLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++){               //Rows
			for(int j=1; j<=7; j++){           //Columns
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		for(int i=1; i<=3; i++){               //Rows
			for(int j=1; j<=i; j++){           //Columns
				System.out.print(j);
			}
			System.out.println();              //codeforwin.org --> for pattern exercises in Java
		}

	}

}
