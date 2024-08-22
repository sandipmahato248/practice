package problemsolving.binarysearch;

public class FirstAndLastOccurance {
	
	 public static void main(String[] args) {
	        int[] arr = {2, 4, 4, 4, 6, 6, 8, 10};  
	        int target = 4;

	        int first = findFirstOccurrence(arr, target);
	        int last = findLastOccurrence(arr, target);
	        System.out.print(first+" "+last);
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
				}else if(arr[mid] > target) {
					end = mid-1;
				}else {
					start = mid+1;
				}
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
