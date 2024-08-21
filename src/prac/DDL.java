package prac;


public class DDL {
	Node header;
	class Node{
		Node previous;
		String data;
		Node next;
		public Node(Node previous, String data, Node next) {
			super();
			this.previous = previous;
			this.data = data;
			this.next = next;
		}
			
	}
	
	public void addFirst(String s) {
		Node newNode = new Node(header,s,header.next);
		if(header.next != null) {
			header.next.previous = newNode;
		}
		header.next = newNode;
		
		
	}
	
	public void insert(String s, int pos) {
		if(pos <0 || pos>size()) throw new IndexOutOfBoundsException();
		Node next = header;
		Node previous = null;
		for(int i=0;i<=pos;i++) {
			if(i==pos)
				previous = next;
			
			next = next.next;
		}
		
		Node insertNode = new Node(previous,s,next);
		if(next != null)
			next.previous = insertNode;
		
		previous.next = insertNode;	
		
	}
	
 	public boolean remove(String s) {
 		int pos = find(s);
 		if(pos ==-1) return false;
 		return remove(pos);
 		
 	}
	
	public boolean remove(int index) {
		Node tobeRemoved = getNode(index);
		if(tobeRemoved == null) return false;
		Node previous =tobeRemoved.previous;
		Node next = tobeRemoved.next;
		previous.next = next;
		if(next != null)
			next.previous = next;
		
		tobeRemoved = null;
		return true;
	}
	
	public int find(String s) {
		if(s == null) return -1;
		Node currNode = header;
		int i =-1;
		while(currNode.next != null) {
			++i;
			currNode = currNode.next;
			if(s.equals(currNode.data)) return i;
		}
		return -1;
		
	}
	
	public void printNode() {
		Node currNode = header.next;
		while(currNode.next != null) {
			System.out.println(currNode.data+"->");
			currNode = currNode.next;
		}
		System.out.println(currNode.data);
	}
	
	public int size() {
		Node next = header.next;
		int count  =0;
		while(next != null) {
			count++;
			next = next.next;
		}
		return count;

	}
	
	public boolean isEmpty() {
		return header.next == null || size() == 0;
	}
	
	
	public String get(int pos) {
		Node node = getNode(pos);
		return node == null ? null : node.data;
	}
	
	
	public Node getNode(int pos) {
		if(pos<0 || pos> size()) throw new IndexOutOfBoundsException();
		Node next = header;
		for(int i=0; i<=pos;i++) {
			next = next.next;
		}
		return next;
		
	}
	

}
