package d1Arrays;

public class ArrayMissingNoProblem {
	
	//Find 'Missing number' in the range of array

	public static void main(String[] args) {
		int a[] = {0,1,2,3,5,6};
		System.out.println(missingNo(a));
	}
	
	static int missingNo(int b[]){
		int n = b.length;
		int sum = 0;
		for(int i=0; i<n; i++){
			sum+=b[i];
		}
		return n*(n+1)/2 - sum;	
	}
}
