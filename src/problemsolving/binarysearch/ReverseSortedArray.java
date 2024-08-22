package problemsolving.binarysearch;

//Binary search in reversed sorted array
public class ReverseSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {10, 8, 6, 4, 2, 1};  
	    int target = 6;

	    int result = binarySearch(arr, target);
	    System.out.print(result);
	}

	private static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] > target) 
				start = mid+1;
			else end = mid-1;
		}
		
		return -1;
	}
	

}
