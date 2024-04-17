package tree;
// PreOrder, InOrder and PostOrder Tree Traversals
// PreOrder Traversal : Root is first visited- and then left and right (ABC)
// InOrder Traversal : Left is first visited and then root and right (BAC)
// PostOrder Traversal : Left is first visited and then right and finally root (BCA)

//PreOrder : 10 5 3 8 15 12
//InOrder : 3 5 8 10 12 15
//PostOrder : 3 8 5 12 15 10

public class Demo {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(10);  //10 is a root node's value
		tree.insertLeft(tree.root, 5);
		tree.insertRight(tree.root, 15);
		
		tree.insertLeft(tree.root.left, 3);
		tree.insertRight(tree.root.left, 8);
		tree.insertLeft(tree.root.right, 12);
		
		//preOrder
		BinaryTree.preOrder(tree.root);
		System.out.println();
		
		//inOrder
		BinaryTree.inOrder(tree.root);
		System.out.println();
		
		//postOrder
		BinaryTree.postOrder(tree.root);
	}
}
