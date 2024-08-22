package problemsolving.binarysearch;

public class InfiniteSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 10, 14, 18, 21, 35, 47, 59, 62, 79, 99 };
		int target = 18;
		int position = findPosition(arr, target);
		System.out.println("The target " + target + " is found at index: " + position);
	}

	private static int findPosition(int[] arr, int target) {
		// Step 1: Start with initial bounds
		int start = 0;
		int end = 1;

		// Step 2: Exponentially increase high until we find a range
		while (target > arr[end]) {
			start = end; // Move low to high
			end = 2 * end; // Exponentially increase high
		}
		// Step 3: Perform binary search in the found range
		return binarySearch(arr, start, end, target);
	}

	private static int binarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return mid; // Target found
			else if (arr[mid] < target)
				start = mid + 1; // Move to the right half
			else
				end = mid - 1; // Move to the left half
		}
		return -1; // Target not found
	}

}
