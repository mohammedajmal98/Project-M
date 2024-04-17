package linkedListCircular;

public class Q0142ReturnTheCycleStartNode {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	public ListNode detectCycle(ListNode head){
		ListNode slow = head, fast = head, prev = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow==fast){ 
				slow = head;
				while(slow!=fast){
					prev = fast;	//to break the cycle
					slow = slow.next;
					fast = fast.next;
				}
				prev.next = null;	//sets to null to end the cycle
				return slow;
			}
		}
		return null;
	}

}
