package interviewBased;
//Merge two sorted arrays A and B as merged  sorted array 'C'

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
//		int a[] = {1,2,3,4,4};
//		int b[] = {2,4,5,5};    //Output should be {1,2,2,3,4,4,4,5,5}
		
		int a[] = {2,5,7,9,11,15};
		int b[] = {1,3,6,7,13};
		int sum = 0;
		int k = 0;
		
		int c[] = new int[11];
		
		for(int i=0; i<7; i++){
			if(i<6){
				if(a[i]<=b[sum]){
					c[k] = a[i];
					k++;
				}
				else{
					c[k] = b[sum];
					b[sum] = a[i];
					k++;
					sum++;
					i--;
				}
			}
			else if (k<11){
				c[k] = b[sum];
				System.out.println(c[k] + " " + k + " " + i);
				k++;
				sum++;
			}
			System.out.println(Arrays.toString(c));
		}
		System.out.println(Arrays.toString(c));

	}

}
