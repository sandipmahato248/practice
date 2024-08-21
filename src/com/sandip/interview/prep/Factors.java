package com.sandip.interview.prep;

import java.util.Arrays;

public class Factors {
	
	public static void main(String[] args) {
		factors(10);
		printNum(1);
		int arr[] = {1,2,5,7,9,0,4,6};
		Arrays.sort(arr);
		int secondMax = arr[arr.length-2];
		System.out.println(secondMax);
	}
	
	private static void factors(int n) {
		//int n=100;
		for(int i=1; i<=n; i++) {
			System.out.println("factors of number "+i+ "are: ");
			for(int j=1; j<=i; j++) {
				if(i % j ==0)
					System.out.println(" "+j);
			}
		}
		
	}

	//print 1 to 10 without using loop
	private static void printNum(int n) {
		if(n==10) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printNum(n+1);
	}
	
	

}
