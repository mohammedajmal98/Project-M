package bst;

/* Deletion Scenarios:
 * 	1) Leaf Node
 * 			Make the parent points to null(left/right)
 * 
 *  2) Node with one child
 *  		Make the parent points to its grandchild (as we delete its child(to be deleted node) )
 *  
 *  3) Node with two children
 *  		Replace the node value to be deleted with its inOrder(ascending order) Successor. Then, delete
 *  	that inOrder successor from its right subtree.[i.e., Minimum value of its right subtree]
 *  	(can also be done with inOrder predecessor, but it is not preferable)
 * 
 */
public class Deletion {
	

}
