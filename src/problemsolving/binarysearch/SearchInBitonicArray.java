package problemsolving.binarysearch;

public class SearchInBitonicArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 8, 12, 4, 2 };
		int target = 4;
		int result = searchInBitonicArray(arr, target);
		System.out.println("Element found at index: " + result);
	}

	private static int searchInBitonicArray(int[] arr, int target) {
		int peak = findPeakElement(arr);

		// Search in the left (increasing) part
		int leftResult = binarySearch(arr, 0, peak, target, true);
		if (leftResult != -1) {
			return leftResult;
		}
		// Search in the right (decreasing) part
		return binarySearch(arr, peak + 1, arr.length - 1, target, false);
	}
	
	private static int findPeakElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid; // Peak is on the left side
			} else {
				start = mid + 1; // Peak is on the right side
			}
		}
		return start; // Low and high will converge to the peak element
	}

	private static int binarySearch(int[] arr, int start, int end, int target, boolean ascending) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) 
				return mid;
			
			if (ascending) {
				if (arr[mid] < target) 
					start = mid + 1;
				 else 
					end = mid - 1;	
			} else {
				if (arr[mid] > target) 
					start = mid + 1;
				else 
					end = mid - 1;
			}
		}
		return -1; // Target not found
	}

	

}
