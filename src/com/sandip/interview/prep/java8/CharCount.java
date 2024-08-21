package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharCount {
	public static void main(String[] args) {
		
		String str = "Sandip Mahato";
		
		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		//reverse an array
		Integer[] arr = {1,2,3,4,5};
		
		IntStream.range(0, arr.length/2).forEach(i ->{
			int temp = arr[i];
			arr[i] = arr[arr.length-i -1];
			arr[arr.length-i -1]= temp;
		});
		
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr1 = {1,2,3,4,5};
		//using stream 
		List<Integer> arrList = Arrays.stream(arr1)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(arrList);
		
		
		
		List<Integer> arrList1 = Arrays.stream(arr1)
				.sorted((o1,o2) -> o2.compareTo(o1))
				.collect(Collectors.toList());
		
		System.out.println(arrList1);
		
		
		
		
		
		
	}

}
