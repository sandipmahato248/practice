package problemsolving.binarysearch;

//test
//test
public class CeilInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
		int target = 5;
		int ceil = findCeil(arr, target);
		System.out.println("The ceil of " + target + " is: " + ceil);
	}

	private static int findCeil(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) return arr[mid];
			else if(arr[mid] > target) {
				result = arr[mid]; // Update the ceil as mid is greater than or equal to target
				end=mid-1;  // Move to the left half to find a closer ceil
			}else {
				start = mid+1;  // Move to the right half
			}
			
		}
		return result;
	}

}
