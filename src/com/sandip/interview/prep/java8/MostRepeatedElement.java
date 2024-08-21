package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sandip", "mahato", "sandip", "shrestha", "ramesh", "shrestha", "movek",
				"shrestha");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Entry<String, Long> result = map.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.get();
		System.out.println(result);
		
		
	}

}
