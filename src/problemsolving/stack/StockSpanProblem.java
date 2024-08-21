package problemsolving.stack;

import java.util.Stack;

//The Stock Span Problem is a classic problem where you are given the prices of stocks over n days,
//and for each day, you need to calculate the stock span. 
//The stock span for a day is defined as the maximum number of consecutive days (including the current day) 
//the stock price has been less than or equal to the price on the current day.
public class StockSpanProblem {

	// This problem is based on the concept of next greater element to left
	public static void main(String[] args) {
	        int[] prices = {100, 80, 60, 70, 60, 75, 85};
	        int[] span = calculateSpan(prices);

	        // Print the stock spans
	        System.out.println("Stock Span:");
	        for (int i = 0; i < span.length; i++) {
	            System.out.println("Day " + (i + 1) + ": " + span[i]);
	        }
	}
	private static int[] calculateSpan(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
	         // Pop elements from stack while the stack is not empty and 
			// the price at the top of the stack is less than or equal to the current day's price
			while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}
			// If stack becomes empty, then price[i] is greater than all elements to its left
            // Else price[i] is greater than elements after the top of the stack
			span[i] = stack.isEmpty() ? (i+1) : (i-stack.peek());
			
			// Push this element's index onto the stack
			stack.push(i);
		}
		
		return span;
	}

}


