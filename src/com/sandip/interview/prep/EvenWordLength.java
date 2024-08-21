package com.sandip.interview.prep;

import java.util.Arrays;

public class EvenWordLength {
	
public static void main(String[] args) {
	
	String str = "Welcome to US";
	String [] splittedStr = str.split(" ");
	
	for(String s : splittedStr) {
		if(s.length() % 2== 0)
			System.out.println(s);
	}
	System.out.println("======");
	//using java8 
	Arrays.stream(str.split(" ")).filter(p -> p.length() %2 ==0).forEach(System.out::println);
	
	//vowel count
	System.out.println(vowelCount(str));
	
	long vowCount = str.chars().mapToObj(c -> c)
	.filter(Character::isLetter)
	.map(Character::toLowerCase)
	.filter(p -> p=='a' || p == 'e' || p == 'i' || p =='o' || p=='u')
	.count();
	System.out.println(vowCount);
}
//vowel count
private static int vowelCount(String str) {
	char[]  ch = str.toCharArray();
	int count = 0;
	for(char c: ch) {
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default: 
				System.out.println();
		}
	}
	
	return count;

	
	
}

}
