package prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
	 public static int solution(String letters) {
	      Map<Character, Integer> letterCount = new HashMap<>();
	        Set<Character> repeatedSet = new HashSet<>();

	        for (char c : letters.toCharArray()) {
	            char lowerC = Character.toLowerCase(c);

	            if (Character.isLetter(c)) {
	                int count = letterCount.getOrDefault(lowerC, 0);
	                letterCount.put(lowerC, count + 1);

	                if (count == 1) {
	                    repeatedSet.add(lowerC);
	                }
	            }
	        }

	        int result = 0;

	        for (char c : letters.toCharArray()) {
	            char lowerC = Character.toLowerCase(c);

	            if (Character.isUpperCase(c) && repeatedSet.contains(lowerC)) {
	                result++;
	                repeatedSet.remove(lowerC); // Mark as processed
	            }
	        }

	        return result;
	        
	 }

	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(solution("aaAbcCABBc"));    // Output: 2
	        System.out.println(solution("xyzXYZabcABC"));   // Output: 6
	        System.out.println(solution("ABCabcAefG"));      // Output: 0
	        System.out.println(solution("авАЬсСАВВс*"));     // Output: 2
	    }

}
