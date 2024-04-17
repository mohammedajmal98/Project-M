package linkedList3Generics;

import java.util.Iterator;

//In linkedList2 package, we implemented LinkedList methods which gonna work only for 'Integers'
/*
 * So in Java, we can use 'generics' to make one code work for all datatypes including Objects.
 * 		*Just mention '<T>' after Class, and wherever datatype needed
 */

public class LinkedList<T> implements Iterable<T> {   //to iterate over the list
		Node head;
		//Define node as 'class'
		class Node{
			T data;
			Node next; //not 'object' creation, just a reference variable. 'next' is referring some 'Node' object
			Node(T val){
				data = val;
				next = null;
			}
		}
		
		//Constructor
		public LinkedList() {
			head = null;
		}
		
		//method 1 - Insert at beginning
		public void insertAtBeginning(T val){
			Node newNode = new Node(val);
			
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
		public void insertAtPosition(int index, T val){
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
			Node prev = null;   //'prev' can also set to 'null' initially and it goes to prv index of del. element
			
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
		
		public Iterator<T> iterator(){   
			//creating anonymous class for "Iterator" interface
			return new Iterator<T>(){
				Node temp = head;
				
				 public boolean hasNext(){
					 return temp!=null;
				 }
				 public T next(){
					 T val = temp.data;
					 temp = temp.next;
					 return val; 
				 }
			};
		}
		
		
		
				

}
