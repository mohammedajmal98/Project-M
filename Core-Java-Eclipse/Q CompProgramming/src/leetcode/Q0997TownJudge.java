package leetcode;

public class Q0997TownJudge {
	
	public static int findJudge(int n, int[][] trust){
		
		int trustArray[] = new int[n+1];
		for(int i=0; i<trust.length; i++){
			trustArray[trust[i][1]] += 1;
			trustArray[trust[i][0]] -= 1;	
		}
		for(int i=1; i<trustArray.length; i++){
			if(trustArray[i]==n-1){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 4;
		int arr[][] = {{2,1},{3,1},{4,1},{2,3},{4,3}};       
		//'1' must be the Town Judge because everyone believes judge but 'Judge' believes no-one
		System.out.println(findJudge(n,arr));
	}

}
