package d1Arrays;

public class arrays2D {

	public static void main(String[] args) {
		// 2-D arrays - Array of Arrays
		
		int hii[][] = { {2,3,4,5},{1,2,3},{7,8,9,0,6} };
		System.out.println(hii);
		
		int marks[][] = new int[3][4];   //3 rows & 4 columns
		//3 1-D arrays with 4 values each
		marks[0][0] = 97;
		marks[2][3] = 100;
		System.out.println(marks[2][3]);
		
		
		int a[][] = new int[4][];      //we can give like this, later we can declare
		//Also, we can give different values for 'column'
		// 4 1-D arrays with different values(no. of columns)
		
		a[0] = new int[5];     // 1st row --> 5 columns
		a[1] = new int[8];     // 2nd row --> 8 columns
		a[2] = new int[90];    // 3rd row --> 90 columns
		a[3] = new int[500];   // 4th row --> 500 columns
		
		a[3][499] = 77;
		System.out.println(a[3][499]);
		
		

	}

}
