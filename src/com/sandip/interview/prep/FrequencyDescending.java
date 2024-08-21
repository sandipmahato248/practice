package com.sandip.interview.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FrequencyDescending {
	public static void main(String[] args) {
		
		String str = "Welcome to USAAAA";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i< str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c,1);
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<>(set);
		list.sort((o1,o2) -> o2.getValue() -o1.getValue());
		
		for(Entry<Character, Integer> e: list) {
			System.out.println("final list   "+ e.getKey() +" -->"+ e.getValue());
		}
		
		System.out.println("============");
		//using java 8
		Map<Character, Long> charFrequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()
                ));
		
		charFrequencyMap.entrySet().stream()
         .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
         .forEach(entry ->
                 System.out.println("Character: " + entry.getKey() +
                         ", Frequency: " + entry.getValue()));
	}

}
