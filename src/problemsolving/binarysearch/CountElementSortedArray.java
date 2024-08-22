package problemsolving.binarysearch;

//same as first and last occurance 
//only calculate count = lastIndex - firstIndex + 1
public class CountElementSortedArray {
	
	 public static void main(String[] args) {
	        int[] arr = {2, 4, 4, 4, 6, 6, 8, 10};  
	        int target = 4;

	        int count = countOccurrences(arr, target);
	        System.out.print(count);
	 }
	 
	  // Function to count the occurrences of the target in the sorted array
	    public static int countOccurrences(int[] arr, int target) {
	        int first = findFirstOccurrence(arr, target);
	        int last = findLastOccurrence(arr, target);

	        // If the element is not found, return 0
	        if (first == -1 || last == -1) return 0;

	        // Count is the difference between last and first occurrence plus 1
	        return last - first + 1;
	    }
	
	
	private static int findFirstOccurrence(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == target) {
				result = mid; // Found the target, but continue searching to the left
				end = mid-1;
			}else if(arr[mid] > target) 
				end = mid-1;
			else 
				start = mid+1;
			
		}
		
		return result;
	}
 
 
private static int findLastOccurrence(int[] arr, int target) {
	int start = 0;
	int end = arr.length-1;
	int result = -1;
	
	while(start<=end) {
		int mid = start + (end-start)/2;
		if(arr[mid] == target) {
			result = mid; // Found the target, but continue searching to the right
			start = mid+1;
		}else if(arr[mid] > target) {
			end = mid-1;
		}else {
			start = mid+1;
		}
	}
	
	return result;
}


}
