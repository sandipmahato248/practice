package com.sandip.test.w3global;

import java.util.HashMap;
import java.util.Map;

public class SampleClass {
	private static final Map<String, String> dataMap;
	static {
	 dataMap = new HashMap<>();
	 dataMap.put("Key1","Value1");
	 dataMap.put("Key2","Value2");
	}

	public SampleClass() {
		// constructor
	}
	
	public static void main(String[] args) {
		   for (Map.Entry<String, String> entry : dataMap.entrySet()) {
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
	}

}
