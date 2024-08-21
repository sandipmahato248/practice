package prac;

public class LQueue {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			tail = head = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public int remove() {
		if(isEmpty()) return -1;
		int front = head.data;
		if(head == tail) {
			tail = null;
		}
		head = head.next;
		return front;
		
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		return head.data;
	}
	

}
