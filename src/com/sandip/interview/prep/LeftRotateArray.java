package com.sandip.interview.prep;

import java.util.Arrays;

public class LeftRotateArray {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int temp= arr[0];
		//shift 1 element to left
		for(int i=1; i< arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]= temp;
		System.out.println(Arrays.toString(arr));
	}

}
