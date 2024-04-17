package oops;

interface Aq {
	int num = 10; //in interface, all variables are public,static and final
}

class AA{
	
	public void show() {
		System.out.println(Aq.num);
	}
}

public class InterfaceVariable {

	public static void main(String[] args) {
		
		System.out.println(Aq.num);
		AA aa= new AA();
		aa.show();

	}

}
