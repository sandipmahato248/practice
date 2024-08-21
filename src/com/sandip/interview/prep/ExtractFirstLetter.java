package com.sandip.interview.prep;

import java.util.Arrays;

public class ExtractFirstLetter {
	public static void main(String[] args) {
		String str = "Welcome to USA";
		String[] splitWords = str.split(" ");

		for (int i = 0; i < splitWords.length; i++) {
			String s = splitWords[i];
			System.out.println(s.charAt(0));
		}
         System.out.println("============");
         
		// using java8
		Arrays.stream(str.split(" ")).filter(p -> !p.isEmpty()).map(p -> p.substring(0, 1))
				.forEach(System.out::println);

	}

}
