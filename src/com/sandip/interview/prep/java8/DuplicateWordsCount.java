package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsCount {
	public static void main(String[] args) {
		String str = "Hello sandip Hello Movek Hello Ramesh";
		Map<String, Long>  map = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((k,v) -> System.out.println("key " +k+ " value "+v));
		map.entrySet().stream().filter(p -> p.getValue()>1).forEach(System.out::println);
		
		System.out.println("=============");
		//duplicate char count
		Map<Character, Long> mapList = str.chars().filter(c -> c != ' ')
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Map<Character, Long> mapData =
				mapList.entrySet().stream()
				.filter(x -> x.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(mapData);
	}

}
