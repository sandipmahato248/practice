package dsa;

public class LQueue {
	
	static class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class Queue{
		static Node head = null;
		static Node tail = null;
		
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		
		public static void add(int data) {
			Node newNode = new Node(data);
			if(tail == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;	
		}
		
		public static int remove() {
			if(isEmpty())
				return -1;
			int front = head.data;
			if(head == tail)
				tail = null;
			head = head.next;
			return front;
		}
		
		public static int peek() {
			if(isEmpty()) return -1;
			return head.data;
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.remove();
		q.add(3);
		q.remove();
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
