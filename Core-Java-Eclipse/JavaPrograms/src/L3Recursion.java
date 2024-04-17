
public class L3Recursion {
	
	//RECURSION - Function/Method calling itself.(To avoid infinite function call, set 'Halting' condition)
	//Normally, Compiler uses 'Stack' for 'Recursive functions'
	//Similar to 'Loops'
	
	public static int sum(int k){
		if(k>0){
			return k + sum(k-1);
		}
		else{
			return 0;
		}	
	}
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	
		
		
		
		

}
