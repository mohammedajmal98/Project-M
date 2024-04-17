package d1Loops;

public class L7LabellingLoopsContinue {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++){               
			for(int j=1; j<=7; j++){ 
				if(i==2&&j==2){
					System.out.print(" ");
					continue;               //comes out of 'j'(inner) loop
				}
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		System.out.println();
		
		outerLoop:         //naming loop
		for(int i=1; i<=3; i++){  
			innerLoop:
			for(int j=1; j<=7; j++){ 
				if(i==2&&j==2){
					System.out.println();
					continue outerLoop;              //comes out of entire 'j'(inner) and 'i'(outer) loop
				}
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
