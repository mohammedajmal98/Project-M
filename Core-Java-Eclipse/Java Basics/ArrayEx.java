
public class ArrayEx {
	public static void main(String[] args) {
		
		int c[] = new int[5];
		
		c[1]=10;
		c[2]=20;
		c[3]=30;
		
		System.out.println(c[0]);
		
		for(int i=0; i<c.length; i++) {
			System.out.print(" " + c[i]);
		}
		System.out.println();
		
		
		
		int a[][] = { {1,2,3,4,5}, {2,4,6}, {1,3,5,7,9,11} }; //Jagged Array (different no of columns in each row)
		
		System.out.println(a[0][3]);
		
		for (int i=0; i<a.length; i++) {  // row
			for (int j=0; j<a[i].length; j++) {  // column
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		
		int b[][] = new int[3][2];  //2D array with same no. of columns
		
		b[0][0] = 13;
		b[1][1] = 26;
		b[2][0] = 39;
		
		for (int i=0; i<3; i++) {  // row
			for (int j=0; j<2; j++) {  // column
				System.out.print(" " + b[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
