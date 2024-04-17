package oops;

class Q {
	int i =10;
	public void show(){
		System.out.println("from Q show");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Q que = new Q() {         //Instead of create seperate class for Overriding only, use anonymous inner class
			public void show(){ 
				System.out.println("from Q show");
			}
		};
		
		que.show();
		System.out.println(que.i);
		
		Q que1 = new Q();
		que1.show();           //Once overrided, we can't print parent(initial) method values

	}

}
