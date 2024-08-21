package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

		// sum of element of arr
		int sum = 0;
		int[] arr = { 1, 2, 4, 5, 7 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		//usng java8
		Arrays.stream(arr).sum();

		// print even and odd from arr
		int[] eArr = new int[5];
		int[] oArr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				eArr[i] = arr[i];
			else
				oArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(eArr));
		System.out.println(Arrays.toString(oArr));
		
		//using java 8 
		int[] evenArr = Arrays.stream(arr).filter(p -> p%2==0).toArray();
		System.out.println(Arrays.toString(evenArr));
		int[] oddArr = Arrays.stream(arr).filter(p -> p%2==1).toArray();
		System.out.println(Arrays.toString(oddArr));
		
		
		System.out.println("----------");
		// check equality of array
		int[] a = { 1, 2, 3, 5 };
		int[] b = { 1, 2, 3, 5 };
		if (Arrays.equals(a, b))
			System.out.println("Equal");
		else
			System.out.println("not");

		// using another approach
		boolean status = false;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i])
					status = false;
				else
					status = true;
			}
		}

		if (status)
			System.out.println("Equal");
		else
			System.out.println("not");
	}

//factorial using recursion
	private static int fact(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fact(num - 1);
	}

}
