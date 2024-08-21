package rec;

public class RecBST {

	public static boolean search(int[] arr, int x) {
		if (arr == null || arr.length == 0)
			return false;
		return recSearch(arr, x, 0, arr.length - 1);

	}

	private static boolean recSearch(int[] arr, int x, int lower, int upper) {
		if (lower > upper)
			return false;
		int mid = (lower + upper) / 2;
		if (arr[mid] == x)
			return true;
		if (x < arr[mid])
			return recSearch(arr, x, lower, mid - 1);
		else
			return recSearch(arr, x, mid + 1, upper);

	}

	// iterative way

	public static boolean itSearch(int arr[], int x) {
		if (arr == null || arr.length == 0)
			return false;
		int lower = 0;
		int upper = arr.length - 1;
		
		while (true) {
			if(lower>upper) return false;
			int mid = (upper + lower) / 2;
			if (x == arr[mid])
				return true;
			if (x < arr[mid])
				upper = mid - 1;
			else
				lower = mid + 1;
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 4, 6, 9 };
		System.out.println(search(arr, 10));
	}

}
