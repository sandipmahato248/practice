package com.sandip.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstPartUpperSecondLower {
	public static void main(String[] args) {
		String sentence = "My name is Sandip";
		int mid = sentence.length()/2;
		String upperCase = "";
		String lowerCase = "";
		for(int i =0; i<sentence.length(); i++) {
			if(i < mid )
				upperCase += Character.toUpperCase(sentence.charAt(i));
			else
				lowerCase += Character.toLowerCase(sentence.charAt(i));
				
		}
		System.out.println(upperCase.concat(lowerCase));
		
		
		//remove char from string
		String s = "mahato";
		String s1 = s.replaceAll("a", "");
		System.out.println(s1);
		
		//using loop
		String s2 ="";
		for(int i=0; i< s.length();i++) {
			if(s.charAt(i) != 'a')
				s2+=s.charAt(i);
				
		}
		System.out.println(s2);
		
		//find the string strating with same first and last char
		List<String> list = Arrays.asList("ab","aba","pop","xyz");
		list.stream().filter(e ->e.length() >0 &&  e.endsWith(String.valueOf(e.charAt(0))))
		.forEach(System.out::println);
		
		//given list convert to uppercase and seprate with comma
		String transformedList = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(transformedList);
	
		
		
	}

}
