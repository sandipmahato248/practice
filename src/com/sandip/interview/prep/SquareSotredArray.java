package com.sandip.interview.prep;

import java.util.Arrays;

//print the square sorted array of positive and negative numbers
public class SquareSotredArray {
	
	public static void main(String[] args) {
		int[] arr = {-6,-1,2,4,5};
		int[] squareSorted = squareSortedArray(arr);
		for(int i: squareSorted) {
			System.out.println(i);
		}
		
		//using java8
		squaredSortedArray(arr);
		
	}

	private static int[] squareSortedArray(int[] arr) {
		int[] squareArray =new int[arr.length];
		int start =0;
		int end = arr.length -1;
		int squareIndex = arr.length-1;  //here we are storing the array from the last
		while(start<= end) {
			if(arr[start] * arr[start] > arr[end]* arr[end]) {
				squareArray[squareIndex--] = arr[start] * arr[start];
				start++;
			}else {
				squareArray[squareIndex--] = arr[end]* arr[end];
				end--;
			}
		}
		
		return squareArray;
	}
	
	//using java8
	private static void squaredSortedArray(int[] array) {
	int[] squaredSortedArray = Arrays.stream(array)
            .map(x -> x * x)
            .sorted()
            .toArray();
	 System.out.println("Sorted Squared Array: " + Arrays.toString(squaredSortedArray));
	
	}

}
