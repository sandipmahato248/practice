package bst;

import bst.BinaryTree.Node;

public class MyBST {
	
	static class Node{
		Node left;
		int data;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left =null;
			this.right = null;
		}
	}
	
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val)
			root.left=insert(root.left,val);
		else
			root.right = insert(root.right,val);
		return root;
	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public static boolean search(Node root, int key) {
		if(root == null) return false;
		if(root.data > key)
			return search(root.left,key);
		else if(root.data == key)
			return true;
		else
			return search(root.right,key);
	}
	
	public static Node delete(Node root,int key) {
		if(root.data > key) {
			root.left = delete(root.left,key);
		}else if(root.data < key) {
			root.right = delete(root.right,key);
		}else {
			//case 1
			if(root.left == null && root.right == null)
				return null;
			//case 2
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			//case 3
			Node is = inorderSuccessor(root.right);
			root.data = is.data;
			root.right = delete(root.right,is.data);
			
		}
		return root;
		
	}
	
	private static Node inorderSuccessor(Node root) {
		while(root.left != null)
			return root.left;
		return root;
	}
	


}
