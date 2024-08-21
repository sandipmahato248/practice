package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream; class Java8Array {
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,2,5,6};
		int[] arr1= {1,1,4,2,5,6};
		
		//second smallest element
		int secondSmallest = Arrays.stream(arr).sorted().skip(1).findFirst().getAsInt();
		System.out.println(secondSmallest);
		

		int distinct2ndSmallest = Arrays.stream(arr1).distinct()
		.sorted().skip(1)
		.findFirst().orElseGet(() -> {throw new NoSuchElementException("No element present");});
		System.out.println(distinct2ndSmallest);
		
		
		//find common element from two arrays
		int[] arr2= {1,3,4,2,5,6};
		int[] arr3= {1,4,5,6};
		//boxed is used to convert intStream to Integer
		
		List<Integer> commonList = Arrays.stream(arr2)
			.filter(number -> Arrays.stream(arr3).anyMatch(arr3Num -> arr3Num == number))
			.boxed()
			.collect(Collectors.toList());
		System.out.println(commonList);
		
		
		//reverse an array
		int[] arr4= {1,3,4,2,5,6};
		IntStream.range(0, arr4.length/2).forEach(i ->{
			int temp= arr4[i];
			arr4[i] = arr4[arr4.length-i-1];
			arr4[arr4.length-i-1] = temp;
		});
		System.out.println(Arrays.toString(arr4));
		
		int[] revArr= {1,3,4,2,5,6};
		int[] reverseArray = IntStream.rangeClosed(1, revArr.length).map(x->revArr[revArr.length-x]).toArray();
		System.out.println("revarr "+ Arrays.toString(reverseArray));
		
		//find length of longest string
		String[] str = {"apple","banana", "mango","watermeleon","apple"};
		Integer countValue = Arrays.stream(str).mapToInt(x -> x.length()).max().orElse(0);
		System.out.println(countValue);
		
		System.out.println("===========");
		
		
		//find duplcate elements
		int[] arr5= {1,1,4,2,5,6,6};
		//using set
		Set<Integer> set = new HashSet<>();
		Set<Integer> dupData = Arrays.stream(arr5)
				.filter(p-> !set.add(p))
				.boxed()
				.collect(Collectors.toSet());
		System.out.println(dupData);
		
		System.out.println("===========");
		
		//duplicate characters in string
		String givenStr = "sandip mahato";
		
		
		
		
		
		
		//remove duplicates while preserving the original order
		
		
		//find the product of all element except the current element
		
		
		
	}
	
	
	
	

}
