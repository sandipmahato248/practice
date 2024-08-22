package problemsolving.stack;

import java.util.Stack;

//minimum stack using extra space
public class MinimunStack {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinimunStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int x) {
		// Push the element onto the main stack
		stack.push(x);
		// Push the minimum value onto the min stack
		if (minStack.isEmpty() || x <= minStack.peek())
			minStack.push(x);
		else
			minStack.push(minStack.peek());
	}

	public void pop() {
		if (!stack.isEmpty()) {
			stack.pop();
			minStack.pop();
		}
	}

	public int top() {
		if (!stack.isEmpty())
			return stack.peek();
		throw new RuntimeException("Stack is empty");
	}

	public int getMin() {
		if (!minStack.isEmpty())
			return minStack.peek();
		throw new RuntimeException("Stack is empty");
	}

}
