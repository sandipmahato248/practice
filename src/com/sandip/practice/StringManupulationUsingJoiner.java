package com.sandip.practice;

import java.util.StringJoiner;

public class StringManupulationUsingJoiner {

	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",");
		str.add("A");
		str.add("B");
		str.add("C");
		
		System.out.println(str);
		
		StringJoiner str1 = new StringJoiner(":","[","]");
		str1.add("P");
		str1.add("Q");
		
		System.out.println(str1);
		
		StringJoiner str2 = str.merge(str1);
		System.out.println(str2);
		System.out.println("==========");
		//find special character from the string
		String spChar = "$ab23%";
		spChar.chars()
		.filter(e -> !Character.isDigit(e) 
				&& !Character.isAlphabetic(e) 
				&& !Character.isWhitespace(e))
		.forEach(ch -> System.out.print((char)ch));
		System.out.println("==========");
		//rotation of two string 
		String s1= "ABCD";
		String s2 = "CDAB";
		
		String s3 = s1.concat(s1);
		if(s3.contains(s2))
			System.out.println("Rotation");
		else System.out.println("not");
		
		
		//count total number of char in string except , and space
		String orgStr ="ab, cd, ef";
		long countStr = orgStr.chars().filter(e -> !Character.isWhitespace(e) && e != ',').count();
		System.out.println(countStr);
		
		//swap two string without using third variable
		String st1 = "sandip";
		String st2 = "mahato";
		
		 st1 = st1.concat(st2);
		 st2 = st1.substring(0,(st1.length() - st2.length()));
		 st1 = st1.substring(st2.length());
		System.out.println(st1+" "+st2);
		
	}
}
