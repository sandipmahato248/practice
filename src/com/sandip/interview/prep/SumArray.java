package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		int sum1 = IntStream.of(arr).sum();
		System.out.println(sum1);
	}

}
