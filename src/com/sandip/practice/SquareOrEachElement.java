package com.sandip.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOrEachElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//square of each element
		
		list.stream().map(e -> e*e)
		.forEach(System.out::println);
		
		//filter number greater than 20
		list.stream().map(e -> e*e)
		.filter(e -> e>20)
		.forEach(System.out::println);
		
		//find the average of the squared num
		double avg = list.stream().map(e -> e*e).collect(Collectors.averagingInt(e -> e));
		System.out.println(avg);
	}

}
