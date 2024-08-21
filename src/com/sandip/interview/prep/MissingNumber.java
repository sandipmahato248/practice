package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		// using sum
		int[] arr = { 1, 2, 4, 3, 5, 7, 8, 9 };
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int arrSum = Arrays.stream(arr).sum();
		int missingNum = sum - arrSum;
		System.out.println(missingNum);

		// using HashSet
		HashSet<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}
		int len = arr.length + 1;
		for (int i = 0; i < len; i++) {
			if (!set.contains(i))
				System.out.println(i);

		}
 
		

	}

}
