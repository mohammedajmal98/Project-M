//Variable length arguments

class AddMany {
	
	public void add(int...n) {
		int sum = 0;
		for(int i: n) {
			sum = sum + i;
		}
		System.out.println(sum);	
	}
	
}

public class Varargs {

	public static void main(String[] args) {
		AddMany obj = new AddMany();
		obj.add(5,6,88,99);
		

	}

}
