package problemsolving.stack;

import java.util.Stack;

//minimum stack using only variable for constant space
public class MinimumStackConstantSpace {
	private Stack<Long> stack;
    private long minElem;
    
    public MinimumStackConstantSpace() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push((long) x);
            minElem = x;
        } else {
            if (x >= minElem) {
                stack.push((long) x);
            } else {
                // Push encoded value if x is less than the current minimum
                stack.push(2L * x - minElem);
                minElem = x;
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        long top = stack.pop();
        if (top < minElem) {
            // Top is an encoded value, update minElem to the previous minimum
            minElem = 2 * minElem - top;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if (top >= minElem) {
            return (int) top;
        } else {
            return (int) minElem;
        }
    }
    
	  public int getMin() {
	        return (int) minElem;
	    }

}
