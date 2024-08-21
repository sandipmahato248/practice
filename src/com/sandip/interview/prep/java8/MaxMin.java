package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,12,14,11,15};
		
		List<Integer> arr1 = Arrays.stream(arr).sorted()
				.limit(2).toList();
		System.out.println("First two Min number "+arr1);
		
		List<Integer> arr2 = Arrays.stream(arr).sorted(Collections.reverseOrder())
				.limit(2).toList();
		System.out.println("First to max number "+arr2);
	}

}
