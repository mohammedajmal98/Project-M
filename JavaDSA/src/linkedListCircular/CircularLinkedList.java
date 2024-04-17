package linkedListCircular;

public class CircularLinkedList<T> {
	
	class Node {
		T data;
		Node next;
		
		Node(T val){
			data = val;
			next = null;
		}	
	}
	
	Node last;
	
	CircularLinkedList(){
		last = null;
	}
	
	public void insertAtBeginning(T val){
		Node newNode = new Node(val);
		if(last==null){
			newNode.next = newNode;
			last = newNode;	
		}
		else{
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	public void insertAtEnd(T val){
		Node newNode = new Node(val);
		if(last==null){
			newNode.next = newNode;
			last = newNode;	
		}
		else{
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;	// Only one additional step needed from Insert at Beginning method
		}
	}
	public void display(){
		if(last==null){
			System.out.println("The list is empty, dude");
			return;
		}
		else{
			Node temp = last.next;
			do{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			while(temp!=last.next);
		}
	}
	
	public void deleteAtBeginning(){
		if(last==null)
			throw new IndexOutOfBoundsException("Deletion Attempted on empty list");
		if(last.next==last){
			last = null;
		}
		else{
			last.next = last.next.next;
		}
	}
	
	public void deleteAtEnd(){
		if(last==null)
			throw new IndexOutOfBoundsException("Deletion Attempted on empty list");
		if(last.next==last){
			last = null;
		}
		else{
			Node temp = last;
			while(temp.next!=last){
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
