
class Relative {
	String name;
	int age;
	
	
	Relative(String n, int a){
		name = n;
		age = a;
	}
}

class Uncle extends Relative{
	String city;
	
	Uncle(String n, int a, String c){
		super(n,a);
		city = c;	
	}
}


public class TestInheritanceConstructor {

	public static void main(String[] args) {
		
		Uncle uncle = new Uncle("John", 45, "Chennai");
		System.out.println("My uncle name is " + uncle.name + " who is " + uncle.age + " living in " + uncle.city);

	}

}
