package com.sandip.interview.prep1;

public class Factorial {
public static void main(String[] args) {
	int n=5;
	int result = 1;
	for(int i=1; i<=n; i++) {
		result=i*result;
	}
	System.out.println(result);
}
}
