package com.sandip.interview.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
	
	public static void main(String[] args) {
		String str = "Welcome to USA sandipese";
		frequencyCount(str);
		System.out.println("===========");
		frequencyCountUsingJava8(str);
		
		wordVowelCount(str);
		//shorcut method find inital length and replace the char with whitespace 
		//and find final length and subtract , it will give the number of char in string
		int initialLength = str.length();
		str = str.replace("e", "");
		int finalLength = str.length();
		System.out.println("No of occurance"+(initialLength - finalLength));
		
	}
	
	private static void frequencyCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
	
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
	private static void frequencyCountUsingJava8(String str) {
		Map<Character, Long> map = str.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		map.entrySet().forEach(k -> {
			System.out.println("key -"+k.getKey()+" value -"+k.getValue());
		});
	}
	
	

	private static void wordVowelCount(String str) {
		int wordCount =0;
		int vowelCount =0;
		int upperCaseCount =0;
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case '.':
			case ' ':
				wordCount++;
			}
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount++;
			}
			if(ch >=65 && ch <= 90)
				upperCaseCount++;
			
			System.out.println("word "+wordCount+" vowel "+vowelCount+" Upper  "+upperCaseCount);
			
		}
	}
	
	
}
