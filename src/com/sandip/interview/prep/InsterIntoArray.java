package com.sandip.interview.prep;

import java.util.Arrays;

public class InsterIntoArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,0};
		int val = 100; int index = 2;
		
		for(int i= arr.length-1; i>index; i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = val;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
