package bst;

public class BST1 {
	class Node{
		Node left;
		int data;
		Node right;
		
		public Node(int data) {
			this.left = null;
			this.data = data;
			this.right = null;
		}
	}
	
	public Node insert(Node root,int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val) {
			root.left = insert(root.left,val);
		}else {
			root.right = insert(root.right,val);		
		}
		return root;
	}
	
	public void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}
	
	public boolean search(Node root, int val) {
		if(root == null) return false;
		if(root.data > val) 
			return search(root.left,val);
			else if(root.data == val)
				return true;
			else
				return search(root.right,val);
		
	}

	public Node delete(Node root, int val) {
		if(root == null) return root;
		if(root.data > val)
			root.left = delete(root.left,val);
		else if(root.data < val)
			root.right = delete(root.right,val);
		else {
			if(root.left == null && root.right == null)
				return null;
			 if(root.left != null)
				return root.right;
			 else if(root.right == null)
				 return root.left;
			
			Node is = 	inOrderSuccesor(root.right);
			root.data = is.data;
			root.right = delete(root.right,is.data);
		}
		return root;
	}
	
	private Node inOrderSuccesor(Node root) {
		while(root.left!= null)
			return root.left;
		return root;
	}
}
