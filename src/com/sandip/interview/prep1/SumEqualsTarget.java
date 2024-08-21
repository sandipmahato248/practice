package com.sandip.interview.prep1;

import java.util.HashMap;

//1. You will be given an unsorted array of integers and a target t.
//How will you implement a program using a Hashmap to find the position of two numbers whose sum equals target t?
public class SumEqualsTarget {
public static void main(String[] args) {
	int [] arr = {2,7,11,15,18};
	int [] arr1 = target(arr, 18);
	for(int i =0 ; i< arr1.length; i++) {
		System.out.println(arr1[i]);
	}
}

private static int[] target(int[] num , int target) {
	HashMap<Integer, Integer> map = new HashMap<>();
	for(int i =0; i< num.length; i++) {
		if(map.containsKey(target - num[i])) {
			return new int[] {map.get(target-num[i]),i};
		}
		map.put(num[i], i);
	}
	return null;
}
}
