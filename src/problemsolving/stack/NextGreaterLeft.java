package problemsolving.stack;

import java.util.Stack;

//Next Greater Elements to the Left
public class NextGreaterLeft {
	
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		findNextLargestElementLeft(arr);
	}

	private static void findNextLargestElementLeft(int[] arr) {
		if(arr == null || arr.length == 0) {
			System.out.print("Array Empty");
			return;
		}
		
		int nlel[] = new int[arr.length];
		Stack<Integer> stack  = new Stack<>();
		
		for(int i=0; i < arr.length; i++) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) nlel[i] = stack.peek();
			else nlel[i] = -1;
			
			stack.push(arr[i]);
		}
		System.out.println("Next Largest Elements to left :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nlel[i]);
        }
	}
}
