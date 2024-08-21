package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

//merge two unsorted arrays into single sorted array without duplicates?
public class MergeArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 12, 14, 11, 15 };
		int[] arr1 = { 1, 2, 3, 6, 7, 12, 18, 11, 5 };

		// concat two array
		// sort the array
		// find distinct

		int[] arr2 = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1))
				.sorted().distinct().toArray();
		System.out.println(Arrays.toString(arr2));
	}

}
