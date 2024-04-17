package d1Loops;

public class L9ContinueProblems {

	public static void main(String[] args) {
		int n = 5;
		
		OuterLoop:        //Labelling Loops
		for (int i =1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if((i==2 && j==2) || (i==3 && j==4) || (i==4 && j==2)){
					System.out.println();
					continue OuterLoop;        //or simply use 'break' without giving 'labels'
				}
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
