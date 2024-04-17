package tree;

public class BinaryTree {
	Node root;
	
	class Node {
		int data;
		Node left, right;
		
		public Node(int d){  //Node constructor
			data = d;
			left = null;
			right = null;
		}
	}
	
	public BinaryTree(int d){     //BinaryTree Constructor
		root = new Node(d);  	  //calling the 'Node's Constructor'
	}
	
	//insertLeft and insertRight methods
	public void insertLeft(Node r, int val){
		Node newNode = new Node(val);
		r.left = newNode;
	}
	public void insertRight(Node r, int val){
		Node newNode = new Node(val);
		r.right = newNode;
	}
	
	//PreOrder
	public static void preOrder(Node root){
		if(root!=null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//InOrder
	public static void inOrder(Node root){
		if(root!=null){	
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	//postOrder
	public static void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");	
		}
	}
}
