package com.sandip.interview.prep;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String name = "sandeep";
		char[] ch = name.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i =0; i< ch.length; i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i],map.get(ch[i])+1);
			}else {
				map.put(ch[i],1);
			}
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1)
				System.out.println(entry.getKey());
		}
		
	}

}
