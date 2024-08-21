package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfOddAndEven {
	public static void main(String[] args) {
		Integer[] arr= {1,1,4,2,5,6,6};
		
		Integer sumOfEven = Arrays.stream(arr).filter(p -> p%2==0).
				collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sumOfEven);
		
		Integer sumOfOdd = Arrays.stream(arr).filter(p -> p % 2 !=0).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sumOfOdd);
		
		//using partitioning
		Map<Boolean, Integer> value = Arrays.asList(arr).stream().collect(Collectors.partitioningBy(p -> p %2 ==0,
				Collectors.summingInt(Integer::intValue)));
		System.out.println(value);
		
	}

}
