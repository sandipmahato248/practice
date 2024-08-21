package com.sandip.interview.prep;

import java.util.Objects;

//ways to solve this 
//1 using equals method
//2 using Object equals method
//3 using compareTo

public class CompareString {
	
	public static void main(String[] args) {
		String a = "sandip";
		String b = "sandip";
		boolean status = areStringsEqual(a, b);
		System.out.println("Both are equal " + status);
		
		// using Object
		boolean result = Objects.equals(a, b);
		System.out.println("resutl = "+result);

	}

	public static boolean areStringsEqual(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}

		return true;
	}

}
