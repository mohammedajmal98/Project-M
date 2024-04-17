package bst;


public class BinarySearchTree {
	Node root;
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int val){
			key = val;
			left = right = null;	
		}
	}
	
	public BinarySearchTree(int val){
		root = new Node(val);
	}
	public BinarySearchTree(){
		root = null;
	}
	
	//Helper function for insert
	public void insert(int val){
		insert(root, val);
	}
	
	//Insert
	public Node insert(Node root, int val){
		if(root == null){
			return new Node(val);
		}
		
		if(val < root.key){
			root.left = insert(root.left, val);
		}
		else{
			root.right = insert(root.right, val);
		}
		
		return root;   //just to finish the function, not having much importance for this last line
	}
	
	//using "inOrder" to print values in ascending order
	public void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}
	
	
	//Search
	public Node search(Node root, int val){
		if(root == null || root.key == val){
			return root;
		}
		if(val<root.key){
			return search(root.left, val);
		}
	
		return search(root.right, val);
	}
	
	//Delete
	public Node delete(Node root, int val){
		
		if(root == null){
			return root;		//just to terminate the recursion (If the value is no there in actual tree
		}
		
		if(val<root.key){
			root.left = delete(root.left, val);	
		}
		else if(val>root.key){
			root.right = delete(root.right, val);
		}
		else{
			//To delete 'leaf node' or 'node having one child'
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			//To delete 'Two child node'
			root.key = min(root.right);    //selecting/replace min value from the right subtree of the 'val'
			root.right = delete(root.right, root.key); 
			//deleting the min value from its original position	(just like leaf node deletion scenario)
		}
		return root;
	}
	
	//min value of the right subtree
	public int min(Node root){
		int minVal = root.key;
		while(root.left != null){
			minVal = root.left.key; 
			root = root.left;
		}
		return minVal;
	}
	
	
	
	
	
	
	
	

}
