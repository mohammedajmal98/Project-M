package linkedList2;
//Methods - Insert at beginning, display, insert/delete at any pos=

public class LinkedList {
	Node head;
	
	//Define node as 'class'
	class Node{
		int data;
		Node next; //not 'object' creation, just a reference variable. 'next' is referring some 'Node' object
		Node(int val){
			data = val;
			next = null;
		}
	}
	
	//Constructor
	public LinkedList() {
		head = null;
	}
	
	//method 1 - Insert at beginning
	public void insertAtBeginning(int val){
		Node newNode = new Node(val);
		//Actually we don't need if else we can use directly
//		newNode.next = head;
//		head = newNode;
		
		//When list is empty
		if(head==null){
			head = newNode;
		}
		//When list is not empty
		else{
			newNode.next = head;
			head = newNode;
		}	
	}
	
	//method 2 - print/display all elements
	public void display(){
		Node temp = head; //temporary reference variable
		
		while(temp!=null){
			System.out.print(temp.data + " "); 
			temp = temp.next;	//Jump to next node
		}
	}
	
	//method 3 - insert at the particular position
	public void insertAtPosition(int index, int val){
		if(index==0){
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1; i<index; i++){     //To make 'temp' jump into previous node
			temp = temp.next;
			if(temp==null){
				//System.out.println("Invalid Position"); //Instead print statement, throw exception
				//return;
				throw new IndexOutOfBoundsException("Invalid Position: " + index); //Preferable way	
			}
		}
		newNode.next = temp.next;   //"Order" is very important when executing these two statements
		temp.next = newNode;	
	}
	
	//method 4 - delete at the particular position
	public void deleteAtPosition(int index){
		
		if(head==null){ 		//to check whether 'list' is empty
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");	
		}
		
		if(index==0){
			head = head.next;
			return;
		}
		
		Node temp = head;   //It goes to the 'to be deleted element' index
		Node prev = null;   //'prev' can also set to 'null' initially and it goes to prev index of del. element
		
		for(int i=1; i<=index; i++){
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		
	}
	
	//method 5 - delete at the beginning
	public void deleteAtBeginning(){
		if(head==null){ 		//to check whether 'list' is empty
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");	
		}
		
		head = head.next;
	}
	
	//ASSIGNMENT - COMPLETED ---------------------------------------------------------------------------
	//Insert at end
	public void insertAtEnd(int val){
		Node newNode = new Node(val);
		if(head==null){
			head = newNode;
			return;
		}
		
		Node demo = head;
		
		while(demo.next !=null){
			demo = demo.next;
		}
		demo.next = newNode;	
	}	
	
	//Delete at end
	public void deleteAtEnd(){
		Node demo = head;
		if(head==null || head.next==null){
			head = null;
			return;
		}
		while(demo.next !=null && demo.next.next!=null){
			demo = demo.next;
		}
		demo.next = null;	
	}
	
	//Update at the Index
	public void updateUsingIndex(int index, int val){
//		if(index==0){
//			head.data = val;
//			return;
//		}
		Node demo = head;
		for(int i=0; i<index; i++){
			demo = demo.next;
			if(demo==null){
				//System.out.println("Invalid Position"); //Instead print statement, throw exception
				//return;
				throw new IndexOutOfBoundsException("Invalid Position: " + index); //Preferable way	
			}
		}
		demo.data = val;	
	}
	
	//Length  - same as display method
	public void lengthOfList(){
		Node demo = head;
		int count = 0;
		while(demo!=null){
			demo = demo.next;	//Jump to next node
			count++;
		}
		System.out.println("--> No of elements present in the list: " + count);
	}
	
	//Get using Index
	public void getUsingIndex(int index){
		Node demo = head;
		for(int i=0; i<index; i++){
			demo = demo.next;
		} 
		System.out.println("Value at the index " + index + " is " + demo.data);
	}
	
	//Search the value using Index
	public int searchValue(int val){
		Node demo = head;
		int count = 0;
		while(demo!=null){
			if(demo.data == val){
				System.out.print("The Index of the given value is ");
				return count;
			}
			demo = demo.next;	
			count++;
		}
		return -1;	
	}
	
	//Contains the value?
	public boolean containsValue(int val){
		Node demo = head;
		while(demo!=null){
			if(demo.data == val){
				return true;
			}
			demo = demo.next;	
		}
		return false;
	}
	
	//Reverse the list
	public void reverseList(){
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current!=null){
			next = current.next;
			current.next = prev; 
			prev = current;
			current = next;
		}
		head = prev;
		
		display();	
	}
	
	//Leetcode 328 - Not Completed fully (Need to cover edge/boundary cases)
	public void oddEven(){
		Node demo = head;
		Node tail = head.next;
		Node tailTest = head.next;
		if(head==null){
			display();
			return;
		}
		else if (head.next==null || head.next.next==null){
			display();
			return;
		}
		
		else{
			while(demo.next!=null && demo.next.next!=null){
				demo.next = demo.next.next;
				tail.next = demo.next.next;
				demo = demo.next;
				tail = tail.next;
			}
			demo.next = tailTest;
		}
		
		display();
		
		
		
	}
	
	
	
	
	
	
	
	
}
