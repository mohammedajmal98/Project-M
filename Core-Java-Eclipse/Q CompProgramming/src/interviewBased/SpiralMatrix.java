package interviewBased;  //refer "screenshot" for solution

//Arrays.deepToString() --> for printing 2D Arrays
//Arrays.toString() --> for printing 1D Arrays

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{8,9,4},{7,6,5}};
		//output should be [1,2,3,4,5,6,7,8,9] --> Spiral pattern 
		
		System.out.println(Arrays.deepToString(arr));
		int rowStart = 0 ;
		int rowEnd = arr.length - 1 ;
		int colStart = 0 ;
		int colEnd = arr[0].length - 1 ;
		
		while(rowEnd>=rowStart && colEnd>=colStart) {
			
			//print from top left to top right
			for(int i=colStart; i<=colEnd; i++){
				System.out.println(arr[rowStart][i]);
			}
			rowStart++;
			//print from top right to bottom right
			for(int i=rowStart; i<=rowEnd; i++){
				System.out.println(arr[i][colEnd]);
			}
			colEnd--;
			//print from bottom right to bottom left
			for(int i=colEnd; i>=colStart; i--){
				System.out.println(arr[rowEnd][i]);
			}
			rowEnd--;
			//print from bottom left to top left
			for(int i=rowEnd; i>=rowStart; i--){
				System.out.println(arr[i][colStart]);
			}
			colStart++;
			
		}
		
		
		
		
		//System.out.println(Arrays.toString());
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] a = {1,2,3};
//		System.out.println(Arrays.toString(a));

	}

}
