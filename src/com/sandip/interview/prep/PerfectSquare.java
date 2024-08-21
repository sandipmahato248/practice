package com.sandip.interview.prep;

public class PerfectSquare {
	public static void main(String[] args) {
		int n=25;
		for(int i=1; i< n/2; i++) {
			if(i*i == n) {
				System.out.println("perfect square of " +n+" = "+i );
			}
		}
	}

}
