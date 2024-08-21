package prac;

public class StackLL {
	static Node head;
	
	class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public Node (int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int data) {
		if(head ==null) {
			Node nn = new Node(data,null);
			head = nn;
		}
		else {
			Node nn = new Node(data,head);
			nn.next = head;
			head = nn;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		int top = head.data;
		head = head.next;
		return top;
		
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		return head.data;
		
	}
	
	public static void main(String[] args) {
		StackLL s = new StackLL();
		s.add(1);
		s.add(2);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
		s.pop();
		}
	}

}
