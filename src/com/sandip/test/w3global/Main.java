package com.sandip.test.w3global;

public class Main {
	
	public static boolean s2SubstringOfS1(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;

		int s1Length = s1.length();
		int s2Length = s2.length();

		if (s2.length() == 0)
			return true;
		if (s1Length < s2Length)
			return false;

		for (int i = 0; i <= s1Length - s2Length; i++) {
			boolean found = true;
			for (int j = 0; j < s2Length; j++) {
				if (s1.charAt(i + j) != s2.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found) {
				return true;
			}
		}
		return false;
	}
//	public static void main(String[] args) {
//		System.out.println(
//				s2SubstringOfS1("abcde","cd"));
//		System.out.println(
//				s2SubstringOfS1("abcde","ce"));
//		
//	}

	public static void main(String[] args) {

		OnlyThreeInstances instance1 = OnlyThreeInstancesImpl.getInstance();
		OnlyThreeInstances instance2 = OnlyThreeInstancesImpl.getInstance();
		OnlyThreeInstances instance3 = OnlyThreeInstancesImpl.getInstance();

		instance1.handleRequest();
		instance2.handleRequest();
		instance3.handleRequest();
	}

}
