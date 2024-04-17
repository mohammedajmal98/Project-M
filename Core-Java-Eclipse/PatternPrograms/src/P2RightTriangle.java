
public class P2RightTriangle {

	public static void main(String[] args) {
		int n = 5;
		int count = 5;
		
		//My try
		for(int i=1; i<=n; i++){
			for(int j=i; j<=count; j++){
				if(j<n){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}	
			}
			count++;
			System.out.println();
		}
		
		//Right triangle
		for(int i=1; i<=n; i++){
			for(int j=i; j<=n; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
