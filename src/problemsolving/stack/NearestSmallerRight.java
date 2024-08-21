package problemsolving.stack;

import java.util.Stack;

//find nearest smallest element right
public class NearestSmallerRight {
	
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		findNearestSmallestElementRight(arr);
	}

	private static void findNearestSmallestElementRight(int[] arr) {
		if(arr == null || arr.length == 0) {
			System.out.print("Array Empty");
			return;
		}
		
		int[] nser = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i= arr.length-1; i>=0; i--) {
			while(!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) nser[i] = stack.peek();
			else nser[i] = -1;
			
			stack.push(arr[i]);
		}
		
		System.out.println("Next Smaller Elements to Right :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nser[i]);
        }
	}

}
