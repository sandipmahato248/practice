package com.sandip.interview.prep1;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		isAnagram("sandip", "pidsan");
	}
	
	private static void isAnagram(String str1, String str2) {
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		if(Arrays.equals(charArr1, charArr2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not");
		}
	}

}
