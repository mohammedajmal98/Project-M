//package linkedList;
//
//public class LinkedList {
//	Node head;
//	
//	//Insert the element
//	public static LinkedList insert(LinkedList list, int data){
//		Node newNode = new Node(data);
//		newNode.next = null;
//		if(list.head==null){
//			list.head = newNode;
//		}
//		else{
//			Node lastNode = list.head;
//			while(lastNode.next != null){
//				lastNode = lastNode.next;
//			}
//			lastNode.next = newNode;
//		}
//		return list;
//	}
//	
//	//Print all the elements in the list
//	public static void printList(LinkedList list){
//		Node currentNode = list.head;
//		System.out.print("Linked List Elements: ");
//		
//		while(currentNode!=null){
//			System.out.print(currentNode.data + " ");
//			currentNode = currentNode.next;
//		}
//	}
//
//	//main method
//	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		//adding values to the list
//		list = insert(list, 4);  
//		list = insert(list, 1);   
//		list = insert(list, 3);
//		list = insert(list, 8);
//	    printList(list);
//	    deleteByKey(list,1);       //trying to delete the element whose value is '1'
//	    printList(list);
//	}
//
//}
