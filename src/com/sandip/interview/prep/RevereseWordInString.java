package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.Stack;

public class RevereseWordInString {
	public static void main(String[] args) {
		String name = "My name is Sandip";
		String[] splittedName = name.split(" ");
		String reverseWord ="";
		
		for(String s: splittedName) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			reverseWord = reverseWord + sb.toString() +" ";
		}
		System.out.println(reverseWord);
		
		reverseWord1(name);
	}
	
	//using stack
	public static void reverseWord(String str) {
		Stack<Character> s = new Stack<>();
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) != ' ') {
				s.push(str.charAt(i));
			}else {
				while(s.isEmpty() == false) {
					System.out.println(s.pop());
				}
			}
		}
		System.out.println(" ");
		while(s.isEmpty() == false) {
			System.out.println(s.pop());
		}
	}
	//outpue : Sandip is name My
	public static String reverseWord1(String sentence) {
        String reversedSentence = Arrays.stream(sentence.split("\\s+"))
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");
        System.out.println(reversedSentence);
        return reversedSentence.trim();
    }

}
