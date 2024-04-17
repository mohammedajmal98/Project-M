package leetcode;

public class Q0605PlaceFlowers {
	
	static boolean available(int arr[], int n){
		int count = 0;
		
		for(int i=1; i<arr.length-1; i=i+1){
			if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0){
				count++;
				i=i+1;
			}		
		}
		//especially check whether 'first' & 'last' place is eligible to 'plant'
		if(arr[0]==0 && arr[1]==0) {      
			count++;
		}
		if( arr[arr.length-1]==0 && arr[arr.length-2]==0)  {      
			count++;
		}
		System.out.println(count);
		
		if(n<=count){
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int flowerBed[] = {0,0,1,0,0,0,0,0,0,1,0,1,0,0};
		int toPlant = 5;
		
		System.out.println(available(flowerBed,toPlant));
	}

}
