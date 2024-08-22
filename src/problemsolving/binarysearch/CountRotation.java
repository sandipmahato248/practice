package problemsolving.binarysearch;

//steps
// find the index of minimum element and check prev and next index 
//if element is less than both prev and next, i.e. min element index

//The pivot element is the minimum element in the array,
//which is the only element in the array that is smaller than its previous element.
public class CountRotation {
	public static void main(String[] args) {
		int[] arr = { 15, 18, 2, 3, 6, 12 };
		int rotations = countRotations(arr);
		System.out.println("The array is rotated " + rotations + " times.");
	}

	private static int countRotations(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// If the array is already sorted (no rotation)
			if (arr[start] < arr[end]) {
				return start;
			}

			int mid = start + (end - start) / 2;
			int prev = (mid - 1 + arr.length) % arr.length;
			int next = (mid + 1) % arr.length;

			// Check if mid is the minimum element (pivot)
			if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) 
				return mid;
			
			// If the middle element is greater than the rightmost element,
			// the pivot must be in the right half
			else if (arr[mid] >= arr[start]) 
				start = mid + 1;
			
			// Otherwise, the pivot must be in the left half
			else 
				end = mid - 1;
			
		}
		return -1;
	}

}
