package com.sandip.interview.prep;

import java.util.Arrays;

public class MaxDifferenceInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,5,90,66};
		 int max = Arrays.stream(arr).max().getAsInt();
		 int min = Arrays.stream(arr).min().getAsInt();
		 System.out.println("diff="+(max-min));
	}

}
