package com.sandip.interview.prep1;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.print("0 1 ");
		printFibo(0, 1, 10);
	}

	private static void printFibo(int val1, int val2, int num) {
		if (num == 0) {
			return;
		}
		System.out.print(val1 + val2 + " ");
		printFibo(val2, val1 + val2, --num);
	}
}
