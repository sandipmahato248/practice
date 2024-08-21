package dsa;

public class CQueue {
	static class CircularQueue{
		static int arr[];
		static int size;
		static int front =-1;
		static int rear = -1;
		
		public CircularQueue(int n) {
			arr = new int[n];
			size =n;
		}
		
		public boolean isEmpty() {
			return rear ==-1 && front == -1;
		}
		
		public boolean isFull() {
			return (rear +1) % size == front;
		}
		
		public void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			if(front == -1)
				front  =0;
			rear = (rear +1 ) % size;
			arr[rear] = data;
			
		}
		
		public int remove() {
			if(isEmpty()) return -1;
			int result = arr[front];
			
			if(rear == front)
				rear = front = -1;
			else
				front = (front +1) % size;
			
			return result;
		}
		
		public int peek() {
			if(isEmpty()) return -1;
			return arr[front];
		}
	}
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		q.add(6);
		System.out.println(q.remove());
		q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
