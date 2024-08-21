package com.sandip.interview.prep;

import java.util.HashSet;
import java.util.Set;

//contains all the alphabets
public class Panagram {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str));
		System.out.println(isPanagram1(str));
		
	}
	private static boolean isPanagram(String str) {
		if(str.length() < 26)
			return false;
		for(char ch='a'; ch<='z';ch++) {
			if(str.indexOf(ch) <0)
				return false;
		}
		return true;
	}
	
	private static boolean isPanagram1(String str) {
		Set<Character> set = new HashSet<>();
		
		for(char c: str.toLowerCase().toCharArray()) {
			if(Character.isLetter(c))
				set.add(c);
		}
		return set.size() == 26;
		
		
	}

}
