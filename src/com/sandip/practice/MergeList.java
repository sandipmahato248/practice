package com.sandip.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeList {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
		
		Set<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toSet());
		System.out.println(mergedList);
		
		int max = mergedList.stream()
		.sorted()
		.mapToInt(e ->e)
		//.max()
		.min()
		.orElseThrow(() -> new NoSuchElementException("Element not present"));
		System.out.print(max);
		
		//reverse Number 
		int num = 123;
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		String revNum = sb.reverse().toString();
		System.out.println("rev Num"+ revNum);
		
		//reverse number
		int rev = 0;
		while (num != 0) {
			int rem = num %10;
			rev = rev *10 + rem;
			num /=10;
		}
		System.out.println(rev);
		
		//find largest num in arr
		int arr [] = {1,2,5,7,3,8,9};
		int largest = Arrays.stream(arr).max().getAsInt();
		System.out.println(largest);
		
		//merge two arr
		int arr1[] =  {1,2,5,7,3,8,9};
		int arr2[] =  {7,3,8,9,5};
		int merged [] = new int[arr1.length+ arr2.length];
 		
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged,arr1.length, arr2.length);
		System.out.println(Arrays.toString(merged));
		
		//intersection of array
		int intersectionArr [] = Arrays.stream(arr1)
		.filter(e -> Arrays.stream(arr2).anyMatch(x -> x == e))
		.distinct()
		.toArray();
		System.out.println("Intersection "+Arrays.toString(intersectionArr));
		
		
		//first -ve and then +ve
		int arr3 [] = {1,-2,5,-7,-3,8,9};

		int positiveCount=0;
		int negativeCount =0;
		int pArr [] = new int[arr3.length];
		int nArr [] = new int[arr3.length];
		for(int i=0; i< arr3.length;i++) {
			if(arr3[i] < 0) {
				pArr[positiveCount++] = arr3[i];
			}else {
				nArr[negativeCount++] = arr3[i];
			}

		}
		System.out.println(Arrays.toString(pArr));
		System.out.println(Arrays.toString(nArr));
		
		
		//filter even and odd from list
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
		var part = li.stream().collect(Collectors.partitioningBy(e -> e %2==0));
		System.out.println(part);
		
		//print N random Number
		Random r = new Random();
		r.ints(1,100).limit(10).forEach(System.out::println);
		
		//print string having length > 5
		String[] st = {"sandip","mahaot","hello","hi","wewlcome"};
		Stream.of(st).filter(p -> p.length() > 5).forEach(System.out::println);
		
		//group by words length
		Map<Integer, List<String>> ma=Stream.of(st).collect(Collectors.groupingBy(String::length));
		System.out.println("group by words "+ma);
		
		//count frequency of words and print count having greater than 2
		
		List<String> slist = List.of("AA","BB","AA","CC","AA");
		Map<String, Long> map = slist.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		map.entrySet().stream().filter(p -> p.getValue() > 2).forEach(System.out::println);
		
		
		//print all numbers divisble by 2 or print not divisble
		List<Integer> l1 = List.of(2,4,6,8);
		boolean even = l1.stream().allMatch(p->p%2==0);
		System.out.println(even);
		
		//any number divisible by 2
		boolean anyMatch= l1.stream().anyMatch(p -> p%2==0);
		System.out.println(anyMatch);
		
	}

}
