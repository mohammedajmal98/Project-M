package d1Stack;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		
		// Stack - LIFO data structure --> Last-In First-Out
		// stores objects into a sort of 'vertical tower' (a stack of books)
		// 5 Methods:
		// push() --> to add to the top
		// pop() --> to remove from the topmost object
		// peek() --> to retrieve the topmost object without removing it like pop(), use peek()
		// empty() --> to check whether stack is empty (returns 'boolean')
		// search() --> returns the position of the item/object. Topmost is '1', next is '2' respectively
		    // returns '-1' if searched object is not there 
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
//		String a = stack.pop();
//		String b = stack.pop();
		
		System.out.println(stack);
//		System.out.println(a + " " + b);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.search("Two"));
		
		
		// With Stack, we can be run out of memory
		
/*        USES OF STACKS:
 * 				1) undo/redo features in text editors
 * 				2) moving back/forward through browser history
 * 				3) backtracking algorithms (maze, file directories)
 * 				4) calling functions (call stack)
 * 
 * 
 * 
 * 
 */
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
