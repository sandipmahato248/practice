package problemsolving.binarysearch;

public class FirstOneInBinarySortedArray {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 }; // Infinite in nature
		int firstOneIndex = findFirstOne(arr);
		System.out.println("The first occurrence of 1 is at index: " + firstOneIndex);
	}

	private static int findFirstOne(int[] arr) {
		int start = 0;
		int end = 1;

		// Step 2: Find the end bound where arr[end] == 1
		while (arr[end] == 0) {
			start = end; // Move start to end
			end = 2 * end; // Exponentially increase high
		}
		// Step 3: Perform binary search in the range [start, end]
		return binarySearch(arr, start, end);
	}

	private static int binarySearch(int[] arr, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			// Check if mid is the first occurrence of 1
			if (arr[mid] == 1) {
				if (mid == 0 || arr[mid - 1] == 0)
					return mid; // First occurrence of 1 found
				else
					end = mid - 1; // Move to the left half
			} else
				start = mid + 1; // Move to the right half
		}
		return -1;
	}

}
