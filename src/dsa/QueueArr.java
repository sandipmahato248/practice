package dsa;

import java.util.Arrays;

public class QueueArr {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int data) {
		if(arr.length == rear)
			resize();
		else {
			arr[rear++] = data;
			size++;
		}
	}
	
	public int dequeue() {
		if(isEmpty())
			return -1;
		int res = arr[front];
		for(int i=0;i< rear;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return res;
		//return arr[front++];
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		return arr[front];
	}
	
	public void resize() {
		int len = arr.length;
		int newLen = 2* len;
		int[] newArr = new int[newLen];
		System.arraycopy(arr, 0, newArr, 0, len);
		arr = newArr;	
	}
	
	public int size() {
		return size;
	}
	
	
	
	@Override
	public String toString() {
		return "QueueArr [arr=" + Arrays.toString(arr) + ", size=" + size + ", front=" + front + ", rear=" + rear + "]";
	}

	public static void main(String[] args) {
		QueueArr q = new QueueArr();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q);
		System.out.println(q.peek());
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek());
		System.out.println(q);
		
	}
	

}
