package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 50;
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] == sum- arr[i])
					System.out.println(arr[i]+" "+arr[j]);
			}
		}
		//another way
		int[] arr1 = twoSum(arr,sum);
		System.out.println(Arrays.toString(arr1));
		
	}

	private static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			int diff = target - arr[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(arr[i], i);
		}
		return null;
	}

}
