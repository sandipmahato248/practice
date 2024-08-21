package com.sandip.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementOfArray {

	public static void main(String[] args) {
		int[] arr1 = {10, 20,3,40,67};
		int[] arr2 = {5,10,15,20,25};
		
		//intersection
		List<Integer> intersection = Arrays.stream(arr1)
				.filter(p -> Arrays.stream(arr2).anyMatch(e -> e == p))
				.boxed()
				.collect(Collectors.toList());
			System.out.println(intersection);
			
		//Union 
		int[] union = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
				.sorted().distinct().toArray();
				System.out.println(Arrays.toString(union));
			
				
 	}
}
