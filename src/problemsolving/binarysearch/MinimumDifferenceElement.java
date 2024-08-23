package problemsolving.binarysearch;

public class MinimumDifferenceElement {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 10, 12, 15 };
		int target = 8;
		int minDiffElement = findMinDifferenceElement(arr, target);
		System.out.println("Element with the minimum difference: " + minDiffElement);
	}

	private static int findMinDifferenceElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

	  //target is less than the smallest element
		if (target < arr[start])
			return arr[start];

		//target is more than the largest element
		if (target > arr[end])
			return arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			// If the target is exactly at mid
			if (arr[mid] == target) {
				return arr[mid];
			}

			// Narrow down the search range
			if (target < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		
		int leftElement = arr[end]; // The largest element smaller than target
        int rightElement = arr[start]; // The smallest element larger than target
        
        return ((target - leftElement) <= (rightElement - target)) ? leftElement : rightElement;
        
	}

}
