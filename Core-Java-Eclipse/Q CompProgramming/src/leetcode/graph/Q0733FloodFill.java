package leetcode.graph;

import java.util.Arrays;

public class Q0733FloodFill {
	
	 public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		 
		 if(image[sr-1][sc] == image[sr][sc] ){  //top
			 image[sr-1][sc]=color;
		 }
		 if(image[sr+1][sc] == image[sr][sc]){  //bottom
			 image[sr+1][sc]=color;
		 }
		 if(image[sr][sc-1] == image[sr][sc]){  //left
			 image[sr][sc-1]=color;
		 }
		 if(image[sr][sc+1] == image[sr][sc]){  //right
			 image[sr][sc+1]=color;
		 }
		 
		 
		 
	     return image; 
	 }

	public static void main(String[] args) {
		int image[][] = {{1,1,1},{1,1,0},{1,0,1}};      // exp. output: {{2,2,2},{2,2,0},{2,0,1}}
		
		int result[][] = floodFill(image,1,1,2);     //int[1][1] color = 2 
		System.out.println(Arrays.deepToString(image));

	}

}
