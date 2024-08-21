package com.sandip.interview.java9andBeyound;

import java.util.List;
import java.util.NoSuchElementException;

public class Java10 {
	public static void main(String[] args) {
		//local variable type inference
		//var is not keywoard
		var greet = "hello";
		
		//Optional.orElseThrow
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		var filteredList = list.stream()
			.filter(e -> e > 6)
			.findFirst()
			.orElseThrow(() -> new NoSuchElementException("Element Not found"));
		System.out.println(filteredList);
		
		//use toUnmodifiableList/ set / map instead of List.of to create immutable
		
		//List.copyOf(), set, map
		
		List<Integer> list1 = List.copyOf(list);
		list1.forEach(System.out::println);
		System.out.println(list.equals(list1));//true
		System.out.println(list == list1); //true
		
	}

}
