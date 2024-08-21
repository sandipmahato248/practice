package prac;

public class LL {
	static Node head;
	static class Node{
		 Node next;
		 int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	public void printList() {
		if(head == null) return;
		Node currNode = head;
		while(currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println();
		
	}
	
	public void addLast(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	public void deleteFirst() {
		if(head == null) return;
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null)
			return;
		Node secondLast = head;
		Node last = head.next;
		while(last.next != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast = null;
	}

}
