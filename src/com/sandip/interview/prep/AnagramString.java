package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {
	
	public static void main(String[] args) {
		
		String s1 = "sandip";
		String s2 = "pidsan";
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		 if(Arrays.equals(a1,a2))
			 System.out.println("anagram");
		 else
			 System.out.println("not");
		 
		 
		 //using stream
		 s1 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		 s2 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		 if(s1.equals(s2))
			 System.out.println("using stream anagram");
		 else
			 System.out.println("not");
		 
		
	}

}
