package linkedList2;
/*
 * try the following methods:
 * 
 * get(index) 
 * update(index, val)
 * deleteAtEnd()
 * insertAtEnd(val)
 * search(val) - return index or -1
 * contains(val) - return 'true' or 'false'
 * length - number of elements present in the list  
 */


public class Assignment extends LinkedList {
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

}
