package interfaces;

interface Abc {
	void show();
}

public class AAnonymousInnerClassInterface {

	public static void main(String[] args) {
		
		Abc obj = new Abc() {
			          public void show() {
			        	  System.out.println("hiiiiiii");
			          }
				  };
		obj.show();

	}

}
