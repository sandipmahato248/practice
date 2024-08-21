package com.sandip.interview.prep;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 9;
		for(int i=2; i< n/2; i++) {
			if(i % n==0)
				System.out.println("not");
			else
				System.out.println("prim");
		}
	}

}
