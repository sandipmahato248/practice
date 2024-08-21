package com.sandip.interview.prep;

public class ReverseString {
	public static void main(String[] args) {
		String name = "sandip";
//using concatenation operator	
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

//using character array
		String reverse = "";
		char[] arr = name.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
		}
		System.out.println(reverse);

		// using stringBuffer
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
		
		
//using recursion
		System.out.println(reverseStringRecursion(name));

	}

	private static String reverseStringRecursion(String str) {
		if (str.isEmpty() || str == null)
			return str;
		System.out.println("====="+str.substring(1)+"  "+str.charAt(0));
		return reverseStringRecursion(str.substring(1)) + str.charAt(0);
	}

}
