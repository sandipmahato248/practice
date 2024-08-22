package problemsolving.binarysearch;

// nearly sorted -> index may be in i, i-1 or i+1
// If the mid element is greater than the target, 
// adjust right to mid - 2 to search in the left half (skipping mid and mid - 1).
// If the mid element is less than the target, 
// adjust left to mid + 2 to search in the right half (skipping mid and mid + 1).
public class SearchInNearlySortedArray {
	
	public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};  // Nearly sorted array
        int target = 40;
        int index = searchInNearlySortedArray(arr, target);
        System.out.println("Element found at index: " + index);
        
    }

	private static int searchInNearlySortedArray(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = start+(end-start)/2;
			
			if (arr[mid] == target) return mid;
			
			// Check if the target is in the position before mid
			if(mid-1 >= start && arr[mid-1] == target) return mid-1;
			// Check if the target is in the position after mid
			if(mid+1 <= end && arr[mid+1] == target) return mid+1;
			
			// If the target is smaller, it must be in the left half
			if(arr[mid] > target) end = mid-2;
			else start = mid+2; // If the target is larger, it must be in the right half
			
			
			

	            
		}
		return -1;
	}

}
