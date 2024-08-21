package com.sandip.interview.prep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String name = "sandeep";
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char n: name.toCharArray()) {
			if(!set.contains(n)) {
				set.add(n);
				sb.append(n);
			}
		}
		System.out.println(sb.toString());
		
		//using java8 
		String result = name.chars()
				.distinct()
				.mapToObj(c-> String.valueOf((char)c))
				.collect(Collectors.joining());
		System.out.println("Result = "+result);
		
		
		
		int[] arr = {1,2,3,1,2,4,5};
		removeDuplicate(arr);
		findDuplicate(arr);
		removeDup(arr);
		
	}
	//using java 8 
	private static void removeDuplicate(int[] arr) {
		int arr1[] =Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr1));
	}
	
	//find duplicate
	private static void findDuplicate(int [] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i< arr.length; i++) {
			if(set.contains(arr[i]))
				System.out.println(arr[i]);
			else
				set.add(arr[i]);
		}
		System.out.println("=======");
	}
	
	//using bruteforce
	private static void removeDup(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("dup elements "+arr[i]);
				}
			}
		}
	}

}
