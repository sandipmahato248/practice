package com.sandip.interview.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 6, 7, 8 };

		HashSet<Integer> set = new HashSet<>();
		for (int arr : a) {
			set.add(arr);
		}
		
		for(int arr : b) {
			if(set.contains(arr))
				System.out.println(arr);
		}
		
		System.out.println("=============");
		//for 3 arrays
		
		Integer[] a1 = { 1, 2, 3, 4, 5 };
		Integer[] a2 = { 2, 3, 6, 7, 8 };
		Integer[] a3 = {1,2,4,6,7,9};
		
		HashSet<Integer> set1 = new HashSet<>();
		List<Integer> l1 = Arrays.asList(a1);
		List<Integer> l2 = Arrays.asList(a2);
		List<Integer> l3 = Arrays.asList(a3);
		set1.addAll(l1);
		set1.addAll(l2);
		set1.addAll(l3);
		
		List<Integer> finalList = new ArrayList<>();
		for(Integer i: set1) {
			if(l1.contains(i) && l2.contains(i) ||
					l2.contains(i) && l3.contains(i)||
					l3.contains(i) && l1.contains(i)) {
				finalList.add(i);
			}
		}
		finalList.stream().forEach(System.out::println);
		
	}

}
