package prac;

import prac.DDL.Node;

public class DoubleLL {
	Node header;
	class Node{
		Node prev;
		int data;
		Node next;
		
		public Node(Node prev,int data,Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
		
		
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(header,data,header.next);
		if(header.next != null)
			header.next.prev = newNode;
		
		header.next = newNode;	
	}
	
	public void insert(int data, int pos) {
		if(pos<0 || pos>size()) return;
		Node next = header;
		Node previous = null;
		for(int i=0;i<=pos;i++) {
			if(i==pos)
				previous = next;
			
			next = next.next;
		}
		
		Node newNode = new Node(previous,data,next);
		if(next != null) {
			next.prev = newNode;
		}
		previous.next = newNode;
	}
	
	public boolean remove(int data) {
		int pos = search(data);
		return remove1(pos);
	}
	
	public boolean remove1(int pos) {
		Node tobeRemoved = getNode(pos);
		Node prev = tobeRemoved.prev;
		Node next = tobeRemoved.next;
		prev.next = next;
		if(next != null) {
			next.prev = next;
		}
		tobeRemoved = null;
				return true;
	}
	
	private Node getNode(int pos) {
		if(pos<0 ||pos>size()) throw new IndexOutOfBoundsException();
		Node next = header;
		for(int i=0;i<=pos;i++) {
			next = next.next;
		}
		return next;

	}
	
	public int search(int data) {
		Node currNode = header;
		int i =-1;
		while(currNode.next != null){
			++i;
			currNode = currNode.next;
			if(data == currNode.data)
				return i;
		}
		return -1;
	}
	
	public int size() {
		int count =0;
		Node next = header;
		while(next.next != null) {
			count++;
			next = next.next;
		}
		return count;
	}
	public void printList() {
		Node currNode = header;
		while(currNode.next != null) {
			System.out.print(currNode.data +"-> ");
			currNode = currNode.next;
		}
		System.out.println(currNode.next);
		
	}
	
	public boolean isEmpty() {
		return header.next == null || size() ==0;
	}
	
	public int get(int pos) {
		Node n =getNode(pos);
		return n == null ? null : n.data;
	}
	

}
