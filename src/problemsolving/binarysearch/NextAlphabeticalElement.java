package problemsolving.binarysearch;

// same as ceil problem
//only diff is we need to return next element even if the char is present
public class NextAlphabeticalElement {
	
	public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char nextLetter = nextAlphabeticalElement(letters, target);

        System.out.println("The next alphabetical element after '" + target + "' is: " + nextLetter);
    }

	private static char nextAlphabeticalElement(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
        char result = '\0';
        
        while(start<=end) {
        	int mid = start + (end-start)/2;
        	if(letters[mid] > target) {
        		result = letters[mid];
        		end = mid-1;
        	}else {
        		start = mid+1;
        	}
        }
        
		return  result == '\0' ? letters[0] : result; 
	}

}
