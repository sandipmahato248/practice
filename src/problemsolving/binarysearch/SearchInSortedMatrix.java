package problemsolving.binarysearch;

//2 dimensional
public class SearchInSortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = { 
				{ 10, 20, 30, 40 }, 
				{ 15, 25, 35, 45 }, 
				{ 27, 29, 37, 48 }, 
				{ 32, 33, 39, 50 } };

		int target = 29;
		int[] result = searchMatrix(matrix, target);
		System.out.println("Element found at index: [" + result[0] + ", " + result[1] + "]");
	}

	private static int[] searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[] { -1, -1 };
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		// Start from the top-right corner
        int row = 0;
        int col = cols - 1;
        
        while(row<rows && col>=0) {
        	if(matrix[row][col] == target) {
        		return new int[] {row,col};
        	}else if(matrix[row][col] > target) {
        		col--;  //Move left
        	}else {
        		row++;  //Move down
        	}
        }
		return new int[]{-1,-1};
	}

}
