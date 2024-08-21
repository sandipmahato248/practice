package com.sandip.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestConsult {

	public static void main(String[] args) {
		int[] arr =  {1,2,3,6,4,5,1,3};
		
		Map<Integer, Integer>  mapList = new HashMap<>();
		
		for(int num : arr) {
			if(mapList.containsKey(num)) {
				mapList.put(num, mapList.get(num)+1);
			}else {
				mapList.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: mapList.entrySet()) {
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
		
		
	}
}
