package linkedList3Generics;
//for each loop can only work to iterate over an array or an instance of java.lang.Iterable 
//make LinkedList<T> 'Class' implements Iterable<T> 

import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		System.out.println(list.head);
		list.insertAtBeginning("abc");
		list.insertAtBeginning("def");
		list.insertAtBeginning("ghi");
		list.insertAtBeginning("jkl");
		
		list.display();
		System.out.println();
		
		for(String s : list){
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		 

	}

}
