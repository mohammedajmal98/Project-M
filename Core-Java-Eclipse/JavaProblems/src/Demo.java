
public class Demo {
	
	int arr[]={10,12,13};
	
	
	public static void main(String args[]){
		
		Demo obj = new Demo();
		
		System.out.println(obj.arrayCheck());
	}
	
	int arrayCheck(){
		
		int max = arr[0];

	      for(int i=0; i<arr.length; i++) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	}

}
