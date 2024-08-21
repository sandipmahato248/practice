package bst;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	static class Node{
		private int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
		
		
	}
	
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val)  //insert into left subtree
			root.left = insert(root.left,val);
		else 
			root.right = insert(root.right,val);
		
		return root;
		
	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
	public static boolean search(Node root, int key) {
		if(root == null)
			return false;
		
		if(root.data > key) 
			return search(root.left,key);
		else if(root.data == key) 
			return true;
		else 
			return search(root.right,key);
		
	}
	
	public static Node delete(Node root,int val) {
		if(root.data >val)
			root.left = delete(root.left, val);
		else if(root.data < val)
			root.right = delete(root.right,val);
		else { //root.data == val
			//case1
			if(root.left == null && root.right == null)
				return null;
			//case 2
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			//case3 
			Node is = inorderedSuccessor(root.right);
			root.data = is.data;
			root.right = delete(root.right, is.data);
		}
		return root;
			
	}

	public  static Node inorderedSuccessor(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	//print in range
	public static void printInRange(Node root,int x, int y) {
		if(root == null) return;
		
		if(root.data >= x && root.data<=y) {
			printInRange(root.left, x, y);
			System.out.print(root.data+" ");
			printInRange(root.right, x, y);
		}else if(root.data >= y) 
			printInRange(root.left, x, y);
		else
			printInRange(root.right, x, y);
	}
	
	//print root to leaf paths
	public static void printRoot2Leaf(Node root,List<Integer> path) {
		if(root == null) return;
		path.add(root.data);
		//leaf
		if(root.left == null && root.right == null)
			printPath(path);
		else { //non-leaf
			printRoot2Leaf(root.left, path);
			printRoot2Leaf(root.right, path);
		}
		path.remove(path.size()-1);
	}
	
	public static void printPath(List<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int values[] = new int[] {5,1,3,4,2,7}; 
		Node root = null;
		for(int i=0;i<values.length;i++) {
			root = insert(root,values[i]);
		}
		inOrder(root);
		System.out.println();
		if(search(root,5))
			System.out.println("found");
		else
			System.out.println("not found");
		
		delete(root, 4);
		inOrder(root);
		System.out.println();
		
		
		
		int values1 [] = new int[] {8,5,3,1,4,6,10,11,14}; 
		Node root1 = null;
		for(int i=0;i<values1.length;i++) {
			root1 = insert(root1,values1[i]);
		}
		inOrder(root1);
		System.out.println();
		printInRange(root1, 3, 12);
		System.out.println();
		printRoot2Leaf(root1, new ArrayList<>());
		
		
		
	}
}
