package com.sandip.interview.prep1;

//Given an array of non-duplicating numbers from 1 to n where one number is missing,
//write an efficient java program to find that missing number.
public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int n = 100;
		int totalSum = n*(n+1)/2;
		int sum = 0;
		for(int i=0; i< arr.length; i++) {
			sum = sum+arr[i];
		}
		int missingNum = totalSum-sum;
		System.out.println(missingNum);
	}

}
