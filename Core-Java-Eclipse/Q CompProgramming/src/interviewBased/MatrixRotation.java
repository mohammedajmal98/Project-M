package interviewBased;

import java.util.Arrays;

//rotate matrix by 90deg clockwise
//eg: Input: {1,2,3},{4,5,6},{7,8,9}  Output: {7,4,1},{8,5,2},{9,6,3} can be different ratio also 2x3

public class MatrixRotation {

	public static void main(String[] args) {
		
		int a[][] = {{3},{2},{1}};
			
		//Expected output: {{1,2,3},{4,5,6},{7,8,9}}
		int m=3, n=1;
		int low=0, high=m-1, sum=0;
		int b[][] = new int[n][m];
		
		//bottom left to top left
		try{
			for(int j=0; j<m; j++){
				if(j<n){
					for(int i=0; i<m; i++){
						b[low][i] = a[high][sum]; 
						high--;	
					}
					sum++;
					//System.out.println(Arrays.deepToString(b));
					low++; high=m-1;
				}
			}
		}

		catch(Exception e){
			System.out.println("Executed");
		}
		System.out.println(Arrays.deepToString(b));
	}

}
