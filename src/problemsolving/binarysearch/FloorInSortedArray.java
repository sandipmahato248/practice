package problemsolving.binarysearch;

public class FloorInSortedArray {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int floor = findFloor(arr, target);
        System.out.println("The floor of " + target + " is: " + floor);
       
    }

	private static int findFloor(int[] arr, int target) {
		int start = 0; 
		int end = arr.length - 1;
        int floor = -1;
        
        while(start<=end) {
        	int mid = start + (end-start)/2;
        	
        	if(arr[mid]== target) return arr[mid];
        	else if(arr[mid] < target) {
        		floor=arr[mid]; // Update the floor as mid is less than target
        		start = mid+1;  // Move to the right half to find a closer floor
        	}else
        		end = mid-1; //move to left half
        	
        }
		return floor;
	}

}
