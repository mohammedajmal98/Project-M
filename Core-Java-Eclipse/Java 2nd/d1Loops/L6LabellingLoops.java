package d1Loops;

public class L6LabellingLoops {

	public static void main(String[] args) {
		//Labelling Loops --> to use 'break' statement to come out of all loop
		
		for(int i=1; i<=3; i++){               
			for(int j=1; j<=7; j++){ 
				if(i==2&&j==2){
					break;               //comes out of 'j'(inner) loop
				}
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		outerLoop:         //naming loop
		for(int i=1; i<=3; i++){  
			innerLoop:
			for(int j=1; j<=7; j++){ 
				if(i==2&&j==2){
					break outerLoop;              //comes out of entire 'j'(inner) and 'i'(outer) loop
				}
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
