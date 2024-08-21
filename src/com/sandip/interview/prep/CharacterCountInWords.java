package com.sandip.interview.prep;

import java.util.HashMap;
import java.util.Map;

//Character count in each word
public class CharacterCountInWords {

	public static void main(String[] args) {
		charCountInWords();
		System.out.println("=========");

		
		countCharInWords();
		
	}
	
	//using map, just split the string and put the words as key and length as value
	private static void countCharInWords() {
		Map<String, Integer> map = new HashMap<>();
		String words = "Hello welcome to Java";
		String[] splittedWords = words.split(" ");
		for(String s: splittedWords) {
			map.put(s, s.length());
		}
		map.forEach((k,v) ->{
			System.out.println(k+" "+v);
		});
	}



	private static void charCountInWords() {
		String words = "Hello welcome to Java";
		char[] ch = words.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0)
				System.out.println(s + "  ->>>" + s.length());
		}
	}

}
