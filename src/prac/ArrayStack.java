package prac;

import java.util.Arrays;

public class ArrayStack {
	
	private final int INITIAL_LEN = 2;
	private int top;
	private int [] arr;
	
	public ArrayStack() {
		arr = new int[INITIAL_LEN];
		top =0;
	}
	
	public void push(int data) {
		if(top == arr.length)
			resize();
		arr[top++]	= data;	
	}
	
	public int pop() {
		if(isEmpty()) throw new IllegalStateException("Stack is empty");
		
		int res = arr[top-1];
		arr[top-1] = 0;
		top--;
		return res;
	}
	
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Stack is empty");
		return arr[top-1];
		
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length;
	}
	
	private void resize() {
		int len = arr.length;
		int newLen = 2 * len;
		int temp[] = new int[newLen];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;
	}
	
	
	
	@Override
	public String toString() {
		return "ArrayStack [INITIAL_LEN=" + INITIAL_LEN + ", top=" + top + ", arr=" + Arrays.toString(arr) + "]";
	}

	public static void main(String[] args) {
		ArrayStack al = new ArrayStack();
		al.push(1);
		al.push(2);
		al.push(3);
		System.out.println(al.peek());
		al.pop();
		//al.peek();
		System.out.println(al.peek());
	}

}
