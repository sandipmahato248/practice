package problemsolving.binarysearch;

// should be greater than both neighbouring elements
public class PeakElement {
	

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
		int peakIndex = findPeakElement(arr);
        System.out.println("The peak element is at index: " + peakIndex);
    }

	private static int findPeakElement(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>arr[mid+1])
				end = mid; // Move towards the left (since the peak is on the left side)
			else 
				start = mid+1; // Move towards the right (since the peak is on the right side)
		}
		  // When low == high, we found a peak element
		return start;
	}

}
