package com.sandip.interview.prep;

import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0; int b = 1;
		System.out.print(a+ " " +b);
		int sum = 0;
		for(int i = 2; i< 10; i++) {
			sum = a + b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
			
		}
		System.out.println("==========");
		
		//using java8
		Stream.iterate(new int[] {0,1}, x->new int[] {x[1],x[0]+ x[1]})
		.limit(10).map(x ->x[0]).forEach(System.out::println);
	}

}
