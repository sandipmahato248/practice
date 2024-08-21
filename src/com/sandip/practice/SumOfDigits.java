package com.sandip.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int sum =0;
		while(num > 0) {
			sum = sum + num %10;
			num /= 10;
		}
		System.out.println(sum);
		
		
		//duplicate char in string;
		String s = "ababcd";
		char[] arr = s.toCharArray();
		Set<Character> c = new HashSet<>();
		for(Character ch: arr) {
			if(!c.contains(ch)) 
				c.add(ch);
			else
				System.out.println(ch);
					
		}
		
	
	}

}
