package bst;

//Time Complexity : Search, Insert, Delete ==> O(h), h-height of the tree
// Try to make tree always 'balanced', If unbalanced, leads to more height and also more operations
// can make time complexity as O(log n) if tree is balanced. (Avoid right-skewed, left-skewed tree as it is completely unbalanced


public class Demo {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(50);
		System.out.println(bst.root.key);
		
		bst.insert(20);
		bst.insert(70);
		bst.insert(10);
		bst.insert(25);
		bst.insert(60);
		bst.insert(90);
		
		bst.inOrder(bst.root);   //for ascending order 
		
		System.out.println();
		
		//search
		if(bst.search(bst.root, 72) == null){
			System.out.println("value not found");
		}
		else{
			System.out.println("value found");
		}
				
		bst.delete(bst.root, 70);
		bst.inOrder(bst.root);

	}

}
