package problemsolving.stack;

import java.util.Stack;

// next greater element to right
public class NextGreaterRight {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		findNextLargestElement(arr);
	}

	private static void findNextLargestElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int[] nle = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		// Traverse the array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {
			// Remove elements from the stack that are smaller or equal to the current element
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}

			if (!stack.isEmpty()) nle[i] = stack.peek();
			else nle[i] = -1;
			
			stack.push(arr[i]);
		}
		
		 System.out.println("Next Largest Elements:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i] + " -> " + nle[i]);
	        }

	}

}
