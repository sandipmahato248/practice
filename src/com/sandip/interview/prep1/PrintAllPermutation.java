package com.sandip.interview.prep1;

public class PrintAllPermutation {
	public static void main(String[] args) {
		 String s = "cat";
	       printallPermutns(s, "");
	}
	
	private static void printallPermutns(String str1,String str2) {
		if(str1.length() == 0) {
			System.out.println(str2+ " ");
			return;
		}
		
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			String str3 = str1.substring(0,i)+str1.substring(i+1);
			printallPermutns(str3, str2+ch);
		}
	}

}
