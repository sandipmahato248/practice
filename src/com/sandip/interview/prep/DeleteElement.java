package com.sandip.interview.prep;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int [] arr1 = new int[arr.length-1];
 		int deleteElement = 5;
 		int index = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != deleteElement) {
				arr1[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		//using java 8
		int [] arr2 = Arrays.stream(arr).filter(p -> p != deleteElement).toArray();
		System.out.println(Arrays.toString(arr2));
 	}

}
