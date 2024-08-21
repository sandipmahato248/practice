package com.sandip.interview.prep1;

import java.util.Arrays;

//How do you sort an array of 0 and 1?
public class SortArray {
	
	public static void main(String[] args) {
		int [] arr = {0,1,1,0,1,1,0};
		int countZero = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) countZero++;
		}
		for(int i=0; i<arr.length;i++) {
			if(i<countZero) arr[i]=0;
			else arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
