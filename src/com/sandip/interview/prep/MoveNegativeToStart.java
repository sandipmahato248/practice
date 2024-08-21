package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.Comparator;

public class MoveNegativeToStart {

	public static void main(String[] args) {
		int [] arr = {10,-20,-30,40,-90,50};
		int [] newArr = new int[arr.length];
		int index =0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] < 0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
	}
	
	

}
