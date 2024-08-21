package com.sandip.interview.prep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WaysToIterateMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sandip");
		map.put(2, "Movek");
		map.put(3, "Manish");
		map.put(4, "Dipesh");
		map.put(5, "Kushal");

		keySetIteration(map);
		System.out.println("-------------------");
		
		entrySetMap(map);
		System.out.println("-------------------");
		
		strems(map);
		System.out.println("-------------------");
		
		forEachLoop(map);
		System.out.println("-------------------");
		iteratorMap(map);
	}
//using forEach	
private static void forEachLoop(Map<Integer, String> map) {
		map.forEach((k,v)->{
			System.out.println("Key= "+k+" value="+v);
		});
	}

//using java8 stream	
private static void strems(Map<Integer, String> map) {
		map.entrySet().stream().forEach(i->{
			System.out.println("Key= "+i.getKey()+" value="+i.getValue());
		});
	}
//using entrySet
private static void entrySetMap(Map<Integer, String> map) {
		for(Entry<Integer, String> i: map.entrySet()) {
			System.out.println("Key= "+i.getKey()+" value="+i.getValue());
		}
	}

//using keySet
	private static void keySetIteration(Map<Integer, String> map) {
		for (Integer i : map.keySet()) {
			System.out.println("key= " + i + " Value= " + map.get(i));
		}
	}

//using iterator
	private static void iteratorMap(Map<Integer, String> map) {
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> it = iterator.next();
			System.out.println("key= " + it.getKey() + " value= " + it.getValue());
		}
	}

}
