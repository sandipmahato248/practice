package com.sandip.interview.prep;

public class PalindromString {
//madam
	public static void main(String[] args) {
		String name = "madam";
		StringBuffer sb = new StringBuffer(name);
		String rev = sb.reverse().toString();
		
		if(name.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("not");
	}
}
