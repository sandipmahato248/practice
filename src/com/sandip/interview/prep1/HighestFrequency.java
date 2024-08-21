package com.sandip.interview.prep1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Write a program to find the highest frequency of a character in a given string
public class HighestFrequency {
	public static void main(String[] args) {
		String input = "hello";
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		char maxChar = '\0'; // Default value for an uninitialized char
		int maxFrequency = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxFrequency) {
				maxChar = entry.getKey();
				maxFrequency = entry.getValue();
			}
		}

		System.out.println(maxChar+" --- "+maxFrequency);
	}
}
