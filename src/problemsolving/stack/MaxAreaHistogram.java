package problemsolving.stack;

import java.util.Stack;

//find nearest smaller index left 
//find nearest smaller index right
// width = right-left-1
//then calculate area = max(height[i] * widht[i])
public class MaxAreaHistogram {

	public static void main(String[] args) {
		int[] heights = { 6, 2, 5, 4, 5, 1, 6 };
		int maxArea = getMaxArea(heights);
		System.out.println("Maximum Area of Histogram: " + maxArea);
	}

	private static int getMaxArea(int[] heights) {
		int n = heights.length;
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;
		
		for(int i=0; i<n; i++) {
			while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
				int height = heights[stack.pop()];
				int width = stack.isEmpty()? -1 : i-stack.peek()-1;
				int area = height * width;
				maxArea = Math.max(maxArea, area);
			}
			stack.push(i);
		}
		  // Now pop the remaining bars from the stack and 
		//calculate the area with each popped bar as the smallest bar
		  while (!stack.isEmpty()) {
	            int height = heights[stack.pop()];
	            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
	            int area = height * width;
	            maxArea = Math.max(maxArea, area); // Update max area if needed
	        }
		
		
		return maxArea;
	}

}
