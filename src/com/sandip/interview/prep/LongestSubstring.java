package com.sandip.interview.prep;

import java.util.HashSet;

//longest substring without repetation
public class LongestSubstring {
	
	public static void main(String[] args) {
		
		String str = "abcdab";
		HashSet<Character> set = new HashSet<>();
		String longestTillNow="";
		String longestOverAll = "";
		
		for(char c: str.toCharArray()) {
			if(set.contains(c)) {   
	// if element contains clear the set and assign empty string in longesttillnow variable
				longestTillNow ="";
				set.clear();
			}
			set.add(c);
			longestTillNow +=c;
			if(longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow; 
			}
		}
		System.out.println(longestOverAll);
		
	}

}
