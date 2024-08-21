package dsa;

import java.util.Arrays;


public class StackArr {
	private final int INITIAL_LEN =2;
	private int top;
	private int arr[];
	
	public StackArr() {
		arr = new int[INITIAL_LEN];
		top =0;
	}
	
	public void push(int data) {
		if(arr.length == top)
			resize();
		arr[top++] = data;
	}
	
	public int pop() {
		if(top == -1)
			throw new IndexOutOfBoundsException();
		int result = arr[top-1];
		arr[top-1] = 0;
		top--;
		return result;
	}
	
	public int peek() {
		if(top == -1)
			throw new IndexOutOfBoundsException();
		return arr[top-1];
	}
	
	public void resize() {
		int len = arr.length;
		int newLen = 2* len;
		int[] temp = new int[newLen];
		System.arraycopy(arr,0, temp, 0, len);
		arr = temp;
	}
	
	public String toString() {
		return Arrays.toString(arr) +" top="+top;
	}

	public static void main(String[] args) {
		StackArr s = new StackArr();
		s.push(2);
		s.push(1);
		System.out.println(s.peek());
		s.push(4);
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
	}
}
