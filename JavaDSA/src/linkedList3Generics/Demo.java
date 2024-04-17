package linkedList3Generics;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); //can use 'Object' also instead of 'Integer'
		//we need to use class inside <>, so we use 'Wrapper Classes'
		System.out.println(list.head);
		list.insertAtBeginning("abc");
		list.insertAtBeginning("def");
		list.insertAtBeginning("ghi");
		list.insertAtBeginning("jkl");
		
		list.display(); 
			
		
	}

}
