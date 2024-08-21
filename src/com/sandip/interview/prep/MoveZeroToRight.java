package com.sandip.interview.prep;

import java.util.Arrays;

public class MoveZeroToRight {
	public static void main(String[] args) {
		int[] arr = {1,2,0,0,4,5,0};
		int nonZeroIndex = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != 0) {
				arr[nonZeroIndex++] = arr[i];
			}
		}
		for(int i=nonZeroIndex; i< arr.length; i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
