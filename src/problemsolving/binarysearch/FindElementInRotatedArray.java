package problemsolving.binarysearch;

public class FindElementInRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 15, 18, 2, 3, 6, 12 }; // Rotated sorted array
		int target = 3;
		int index = search(arr, target);
		System.out.println("Element found at index: " + index);

	}

	private static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) return mid;
			
			// Determine which part is sorted
			if (arr[start] <= arr[mid]) { // Left half is sorted
				if (target >= arr[start] && target < arr[mid])
					end = mid - 1; // Target is in the left half
				else
					start = mid + 1; // Target is in the right half
			} else { // Right half is sorted
				if (target > arr[mid] && target <= arr[end]) 
					start = mid + 1; // Target is in the right half
				 else 
					end = mid - 1; // Target is in the left half
			}
		}

		return -1;
	}

}
