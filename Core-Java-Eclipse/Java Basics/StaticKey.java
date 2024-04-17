class Data {
	int idNo = 1;
	int salary = 50000;
	static String ceo = "Adam"; // once it is changed to another value, it will stick to that value for every object
	
	
	static { // It will execute first.. static blocks are also used to initialize the objects..
		ceo = "Edwin";
		int b = 4;
		System.out.println("Hello " + (b+2));
	}
}


public class StaticKey {

	public static void main(String[] args) {
		
		Data arun = new Data();
		Data mukesh = new Data();
		
		arun.idNo = 2;
		arun.salary = 60000;
		arun.ceo = "John";
		
		
		mukesh.idNo = 3;
		mukesh.salary = 80000;
		mukesh.ceo = "Newton";
		
		
		System.out.println(arun.idNo + " : " + arun.salary + " : " + arun.ceo);
		System.out.println(mukesh.idNo + " : " + mukesh.salary + " : " + mukesh.ceo);
		
	}

}
