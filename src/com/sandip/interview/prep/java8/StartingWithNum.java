package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.List;

public class StartingWithNum {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","2wo","3three","four");
		list.stream().filter(p -> Character.isDigit(p.charAt(0))).forEach(System.out::println);
	}

}
