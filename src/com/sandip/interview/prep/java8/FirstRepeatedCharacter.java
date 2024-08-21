package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
 
public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "Sandip Mahto";

		Map<Character, Long> map = str.chars()
				.filter(c -> c != ' ')
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(p -> p.getValue() > 1)
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		map.forEach((k, v) -> System.out.println(k + " " + v));

		// next way
		Map<String, Long> mapList = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String repeatedChar = mapList.entrySet()
				.stream()
				.filter(p -> p.getValue() > 1)
				.map(p -> p.getKey()).findFirst()
				.orElse("no repeated char");
		System.out.println(repeatedChar);
		
		
		//Non repeated char change only > to =
		Map<String, Long> mapList1 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String nonRepeatedChar = mapList.entrySet()
				.stream().filter(p -> p.getValue() == 1)
				.map(p -> p.getKey())
				.findFirst()
				.orElse("non repeated char");
		System.out.println(nonRepeatedChar);

	}

}
