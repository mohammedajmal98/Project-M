package linkedListCircular;

public class Q0141CycleDetectionLeetcode {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	public boolean hasCycle(ListNode head){
		ListNode slow = head, fast = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow==fast){ 
				return true;
			}
		}
		return false;
	}
}
