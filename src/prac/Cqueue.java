package prac;

public class Cqueue {
	static int arr[];
	static int size;
	static int rear =-1;
	static int front =-1;
	
	public Cqueue(int n) {
		arr = new int[n];
		size = n;
		
	}
	
	public boolean isEmpty() {
		return(front == rear) ;
	}
	
	public boolean isFull() {
		return((rear+1)%size == front);
	}
	
	public void insert(int data) {
		if(isFull()) return;
		if(front ==-1) {
			front =0;
		}
		rear = (rear +1)%size;
		arr[rear]=data;
	}
	
	public int remove() {
		if(isEmpty())return -1;
		int res = arr[front];
		if(rear == front) {
			rear = front =-1;
		}else
			front = (front +1) % size;
		
		return res;
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		return arr[front];
	}

}
