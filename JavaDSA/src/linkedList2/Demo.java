package linkedList2;

public class Demo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.head);
		
		
		list.deleteAtEnd();
		list.insertAtBeginning(9);
		list.deleteAtEnd();
//		System.out.println(list.head.data);
//		System.out.println(list.head.next);
		
		list.insertAtBeginning(5);
//		System.out.println(list.head.data);
//		System.out.println(list.head.next);
		
		list.insertAtBeginning(10);
		list.deleteAtEnd();
//		System.out.println(list.head.data);
//		System.out.println(list.head.next);
		list.insertAtEnd(321);
		list.insertAtEnd(231);
		list.insertAtEnd(123);
		list.deleteAtEnd();
		
		list.display();
		
		System.out.println();
		list.insertAtPosition(2, 88);
		list.display();
		
		System.out.println();
		list.insertAtPosition(0, 1234);   //Try to insert at the beginning
		list.display();
		
		System.out.println();
		list.insertAtPosition(5, 9876);   //Try to insert at the end
		list.display();
		
//		System.out.println();
//		//list.insertAtPosition(10, 33);   //Try to insert at 'invalid' position
//		list.display();
		
		System.out.println();
		list.deleteAtPosition(2);		//2nd index position will be deleted
		list.display();
		
		System.out.println();
		list.deleteAtPosition(0);		//1st element (0th index) will be deleted
		list.display();
		
		System.out.println();
		list.updateUsingIndex(2, 20);	//Update the element using index
		list.display();
		
		list.lengthOfList();	//Length of the list
		
		list.getUsingIndex(3);	//get the value using Index
		
		System.out.println(list.searchValue(20));	//get the Index using value (returns -1 if not found in the list)
		
		System.out.println(list.containsValue(88));	//contains value or not in (boolean)
		
		list.reverseList();	//Reverse the List
		
		list.insertAtEnd(444);
		list.insertAtEnd(555);
		list.insertAtEnd(666);
		list.insertAtEnd(777);
		System.out.println();
		list.display();
		
		System.out.println();
		list.oddEven();		//Leetcode 328
		
//		System.out.println();
//		System.out.println(list.head.next);
//		System.out.println(list.head.next.next);
//		System.out.println(list.head.next.next.next.data);
//		System.out.println(list.head.next.next.next.next);
	}
}
