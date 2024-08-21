package com.sandip.interview.prep;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		String[] names = { "sandip", "ramesh", "manish", "abhishek" };
		String temp = "";

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
		}
		
		String[] str = Arrays.stream(names).sorted((e1,e2) -> e1.compareTo(e2)).toArray(String[]::new);
		System.out.println(Arrays.toString(str));
		
		
		//using inbuilt method
//		Arrays.sort(names);
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}

	}

}
