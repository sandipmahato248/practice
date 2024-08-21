package problemsolving.stack;

import java.util.Stack;
//find nearest smaller element to left
public class NearestSmallerLeft {
	
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		findNearestSmallestElementLeft(arr);
	}

	private static void findNearestSmallestElementLeft(int[] arr) {
		if(arr == null || arr.length == 0) {
			System.out.print("Array Empty");
			return;
		}
		
		int[] nsel = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<arr.length;i++) {
			while(!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) nsel[i] = stack.peek();
			else nsel[i] = -1;
			
			stack.push(arr[i]);
		}
		System.out.println("Next Smaller Elements to left :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nsel[i]);
        }
		
		
		
		
	}

}
