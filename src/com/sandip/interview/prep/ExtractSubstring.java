package com.sandip.interview.prep;

import java.util.stream.IntStream;

//print all substring of a string
//input abc 
//output:
//a
//ab
//abc
//b
//bc
//c
public class ExtractSubstring {
	public static void main(String[] args) {
		String str = "abc";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}

		}
		System.out.println("=======");
		// java 8
		IntStream.range(0, str.length()).boxed().flatMap(
				start -> IntStream.rangeClosed(start + 1, str.length())
				.mapToObj(end -> str.substring(start, end)))
				.forEach(System.out::println);
	}

}
