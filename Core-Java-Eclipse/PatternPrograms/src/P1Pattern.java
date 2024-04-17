
public class P1Pattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		 //Square pattern
		 for(int i=1; i<=n; i++){                //Outer loop for "ROWS"
			 for(int j=1; j<=n; j++){			 //Inner loop for "COLUMNS"
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		 //Increasing Triangle Pattern
		 for(int i=1; i<=n; i++){
			 for(int j=1; j<=i; j++){
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		//Decreasing Triangle Pattern
		 for(int i=1; i<=n; i++){
			 for(int j=i; j<=n; j++){
				 System.out.print("* ");
			 }
			 System.out.println(); 
		 }
		 
		 //Decreasing Triangle Pattern (My try)
		 int count=5;
		 for(int i=1; i<=n; i++){
			 for(int j=1; j<=count; j++){
				 System.out.print("* ");
			 }
			 count = count - 1;
			 System.out.println(); 
		 }
		 

	}

}
