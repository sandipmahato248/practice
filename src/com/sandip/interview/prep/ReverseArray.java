package com.sandip.interview.prep;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class ReverseArray {
	
	public static void main(String[] args) {
		int [] a = {1,3,5};
		
		Stack<Integer> s = new Stack<>();
		
		for(int i : a) {
			s.push(i);
		}
		
		for(int i=0; i<a.length; i++) {
			a[i] = s.pop();
			System.out.println(a[i]);
		}
		
		//reverse using while loop
		int [] arr = {110,20,30};
		int low =0; int high= arr.length-1;
		int temp;
		while(low<high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
			
		}
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		
	}
	//reverse using java8
	 public static int[] reverseArray(int[] array) {
	        int[] arr = IntStream.range(0, array.length)
	                .map(i -> array[array.length - 1 - i])
	                .toArray();
	        System.out.println(Arrays.toString(arr));
	        return arr;
	    }

}
