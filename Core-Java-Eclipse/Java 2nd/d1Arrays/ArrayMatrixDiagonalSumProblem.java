package d1Arrays;

public class ArrayMatrixDiagonalSumProblem {
	
	//Adding 'sum' of the diagonals of 'Primary Diagonal'(Left-top to Right-bottom)
	// & 'Secondary Diagonal'(Right-top to Left-bottom) in given 'SQUARE MATRIX'
	//Expected Output = 1 + 5 + 9 + 3 + 7 = 25
	

	public static void main(String[] args) {
		int a[][] = { {1,2,3},{4,5,6},{7,8,9} };
		System.out.println(diagonalSum(a));
	}
	
	static int diagonalSum(int b[][]){
		int n = b.length;
		int sum = 0;
		
		//For Primary Diagonal
		int i = 0, j = 0;
		while(i<n){
			if(i==j)
				sum+=b[i][j];
			i++;
			j++;
			//1+5+9 --> Done
		}
		
		//For Secondary Diagonal
		i=0; j=n-1;
		while(i<n){
			if(i==j)
				;
			else
				sum+=b[i][j];
			i++;
			j--;		// 3+7	
		}
		return sum;	
	}
}
