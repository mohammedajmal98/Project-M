package linkedListCircular;

public class Demo {

	public static void main(String[] args) {
		CircularLinkedList<String> list = new CircularLinkedList<>();
		list.display();
		list.insertAtBeginning("Ajay");
		list.insertAtBeginning("Barghav");
		list.insertAtBeginning("Chinna");
		list.display();
		
		System.out.println();
		list.deleteAtEnd();
		list.display();
	}
}
/* Assignment - deleteValue("Ajay"), insertAfter("Chinna"), size(), contains()
 * Doubly circular linked list -> prev and next
 */
