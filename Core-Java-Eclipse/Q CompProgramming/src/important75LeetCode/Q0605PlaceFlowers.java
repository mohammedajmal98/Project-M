package important75LeetCode;

public class Q0605PlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

		//Firstly check whether 'first' & 'last' place is eligible to 'plant'
		if(flowerbed.length>2){
			if(flowerbed[0]==0 && flowerbed[1]==0) {  
				flowerbed[0]=1;    
				count++;
			}
			if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)  {  
				flowerbed[flowerbed.length-1]=1; 
				count++;
			}
		}
		else{
				if(flowerbed.length==1 && flowerbed[0]==0){
					count++;
				}
				else if(flowerbed.length==2 && flowerbed[0]==0 && flowerbed[1]==0){
					count++;
				}
		}

		int i=1; 
		while(i<flowerbed.length-1){
			if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
				flowerbed[i]=1;
				count++;
				i=i+1;
			}	
			i=i+1;	
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
		
		System.out.println(canPlaceFlowers(flowerBed,toPlant));
	}

}
