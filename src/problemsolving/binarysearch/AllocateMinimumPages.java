package problemsolving.binarysearch;

//Given n books, where each book has a certain number of pages, and m students, 
// the task is to allocate books to students such that:
// Each student gets at least one book.
// Allotment of books to students is contiguous.
// The maximum number of pages allocated to a student is minimized.

//refer from aditya verma youtube on binary search
public class AllocateMinimumPages {

	public static void main(String[] args) {
		int[] pages = { 10, 20, 30, 40 };
		int n = pages.length;
		int m = 2;

		System.out.println("Minimum number of pages = " + findPages(pages, n, m));
	}

	private static int findPages(int[] pages, int n, int m) {
		if (m > n)
			return -1;

		int start = Integer.MIN_VALUE;
		int end = 0;

		// Calculate the low and high boundaries for binary search
		for (int i = 0; i < n; i++) {
			start = Math.max(start, pages[i]);
			end += pages[i];
		}
		int result = -1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (isFeasible(pages, n, m, mid)) {
				result = mid; // Store the result
				end = mid - 1; // Try for a smaller value
			} else {
				start = mid + 1; // Try for a larger value
			}
		}

		return result;
	}

// Check if it's possible to allocate books such that the maximum pages is <= curr_min
	private static boolean isFeasible(int[] pages, int n, int m, int curr_min) {
		int studentsRequired = 1;
		int currentSum = 0;
		for (int i = 0; i < n; i++) {
			if (currentSum + pages[i] > curr_min) {
				studentsRequired++;
				currentSum = pages[i];

				if (studentsRequired > m) {
					return false;
				}
			} else {
				currentSum += pages[i];
			}
		}

		return true;
	}

}
