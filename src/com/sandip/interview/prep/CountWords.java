package com.sandip.interview.prep;

import java.util.Arrays;

public class CountWords {
	
	public static void main(String[] args) {
		String str = "Welcome to USA";
		int count =0;
		if(str.charAt(0) != ' ')
			count++;
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) ==' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
			
		System.out.println(count);
		
		// using java8
		long count1 = Arrays.stream(str.split(" ")).filter(word -> !word.isEmpty()).count();
		System.out.println(count1);
		
	}
	

	//wordCount
	private static void wordCount(String str) {
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			String s="";
			while(i<ch.length && ch[i] !=' ') {
				s = s+ch[i];
				i++;
			}
			if(s.length() >0) {
				System.out.println(s +"--> "+s.length());
			}
		}
	}

}
