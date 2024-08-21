package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartingWith {
	
	public static void main(String[] args) {
		String[] str = {"Sandip","Sushil","Movek","Ramesh"};
		
		List<String> strList = Arrays.stream(str)
				.filter(p -> p.startsWith("S")).collect(Collectors.toList());
		System.out.println(strList);
		
		
		
		Integer[] arr = {1,2,11,14,25};
		
		List<String> arrList = Arrays.stream(arr)
				.map(p -> ""+p)
				.filter(p -> p.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(arrList);
	}

}
