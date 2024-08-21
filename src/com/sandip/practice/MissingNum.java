package com.sandip.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int n = arr.length + 1;

		int sum = n * (n + 1) / 2;
		int sumOfArr = Arrays.stream(arr).sum();

		int missingNum = sum - sumOfArr;
		System.out.println(missingNum);

		// given the array print first even and odd number in array
		int index = 0;
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(a));

		// count numbers of 0 and 1's in arr
		int[] arr1 = { 1, 0, 1, 0, 0, 1, 1 };
		long countZero = Arrays.stream(arr1).filter(e -> e == 0).count();
		long countOne = countZero - arr1.length;
		System.out.println(countZero + " " + countOne);
		
		
		//sum the total sum to each element
		int[] arr2 = {10,20,30,40,50};
		
		int arrSum = Arrays.stream(arr2).sum();
		List<Integer> sumList = Arrays.stream(arr2)
				.map(x -> x+arrSum)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(sumList);
		
	}

}
