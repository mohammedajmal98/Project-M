package d1Loops;

public class L10ForEachLoop {
	
	//For each loop --> useful for 'Arrays' to loop over every element in array without using 'for' loop

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int c: a){        //Iterate over every element in array, & store value in 'c'
			sum+=c;
			System.out.print(c + " ");
		}
		System.out.println("\n" + sum);

	}

}
