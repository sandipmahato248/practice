package com.sandip.interview.prep1;

public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("madam"));
	}

	private static boolean checkPalindrome(String word) {
		String str = getReverseWord(word);
		if (str.equals(word)) 
			return true;
		 else
			return false;

	}
//using recursion
	private static String getReverseWord(String word) {
		if (word.isEmpty() || word == null) {
			return word;
		}
		return getReverseWord(word.substring(1)) + word.charAt(0);
		//first word.substring(1) gives adam and m at charAt(0)
		//second word.substring(1) gives dam and a at charAt(0)
	}
	
	private static String getReverse(String word) {
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}
}
