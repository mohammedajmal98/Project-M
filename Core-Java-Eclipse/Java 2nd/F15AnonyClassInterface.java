
// can create "Object" for Interface by using Anonymous Class

interface Bicycle{
	void brand();
	
	default void mileage(){
		System.out.println("60 Kilometers");
	}
}


public class F15AnonyClassInterface {

	public static void main(String[] args) {
		Bicycle b = new Bicycle(){		//Object created using Anonymous class for Interface
			public void brand(){
				System.out.println("Hero");
			}
		};
		
		b.brand();
		b.mileage();

	}

}
