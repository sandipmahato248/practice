package com.sandip.interview.prep;

public class RotationString {
	
	public static void main(String[] args) {
		String s1 ="abcd";
		String rotatedString="bcda";
		
		if(s1.length() == rotatedString.length()) {
			String concatedString = s1+s1; //concat same string and check with rotated string
			if(concatedString.contains(rotatedString))
				System.out.println("True");
			else
				System.out.println("not");
		}
	}

}
