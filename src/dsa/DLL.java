package dsa;


public class DLL {
	Node header;
 class Node{
	 private Node previous;
	 private String value;
	 private Node next;
	public Node(Node previous, String data, Node next) {
		super();
		this.previous = previous;
		this.value = data;
		this.next = next;
	}	 
 }
 
 	public void addFirst(String value) {
 		Node newNode = new Node(header,value,header.next);
// 		if(header.next == null) {
// 			header.next = newNode;
// 			return;
// 		}
 		if(header.next != null) {
 			header.next.previous = newNode;
 		}
 		header.next = newNode;
 		
 	}
 
 	
 	public void insert(String s,int pos) {
 		if(pos>size() || pos <0) throw new IndexOutOfBoundsException();
 		Node next = header;
 		Node previous = null;
 		for(int i=0; i<=pos;i++) {
 			if(i==pos) {
 				previous  = next;
 			}
 			next = next.next;
 		}
 		Node insertNode = new Node(previous,s,next);
 		if(next != null) {
 			next.previous = insertNode;
 		}
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
 		Node previous = tobeRemoved.previous;
 		Node next = tobeRemoved.next;
 		previous.next = next;
 		if(next != null)
 			next.previous = next;
 		
 		tobeRemoved= null;
 		return true;
 	}
 	
 	
 	public int find(String s) {
 		if(s == null) return -1;
 		Node currNode = header;
 		int i=-1;
 		while(currNode.next != null) {
 			++i;
 			currNode = currNode.next;
 			if(s.equals(currNode.value))
 				return i;
 		}
 		return -1;
 	}
 	
 	public int size() {
 		int count =0;
 		Node next = header.next;
 		while(next != null) {
 			count++;
 			next = next.next;
 		}
 		return count;
 	}
 	
 	public void displayNodes() {
 		Node next = header.next;
 		while(next.next != null) {
 			System.out.println(next.value+"->");
 			next = next.next;
 		}
 		System.out.println(next.value);
 	}
 
 	public boolean isEmpty() {
 		return header.next == null || size() ==0;
 	}
 	
 	private Node getNode(int pos) {
 		if(pos>size() || pos<0) throw new IndexOutOfBoundsException();
 		Node next = header;
 		for(int i=0; i<=pos;i++) {
 			next = next.next;
 		}
 		return next;
 	}
 	
 	public String get(int pos) {
 		Node node = getNode(pos);
 		return node != null ? node.value: null;
 	}
 
 public static void main(String[] args) {
	 DLL d = new DLL();
	// d.addFirst("sandip");
	 System.out.println(d);
	
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
