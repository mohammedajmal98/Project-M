import java.util.Scanner;

public class ArraysInMethods {

	   public int max(int [] arr1) {
	      int max = arr1[0];

	      for(int i=0; i<arr1.length; i++ ) {
	         if(arr1[i]>max) {
	            max = arr1[i];
	         }
	      }
	      return max;
	   }

	   public int min(int [] array) {
	      int min = array[0];
	   
	      for(int i = 0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }

	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
	      
	      ArraysInMethods m = new ArraysInMethods();
	      System.out.println("Maximum value in the array is::"+m.max(myArray));
	      System.out.println("Minimum value in the array is::"+m.min(myArray));
	      
	      sc.close();
	   
	   }
}
