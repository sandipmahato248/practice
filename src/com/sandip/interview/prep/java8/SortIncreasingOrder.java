package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIncreasingOrder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sandip", "mahato", "sandip", "shrestha", "ramesh", "shrestha", "movek",
				"shrestha");
		list.stream()
			.sorted(Comparator.comparing(String::length))
			.forEach(System.out::println);
	}

}
