package com.sandip.interview.prep.java8;


public class CustomFunctionalInterfaceImpl {
	public static void main(String[] args) {
		CustomFunctionalInterface cf = (a,b) -> a*b;
		int val = cf.multiply(5, 10);
		System.out.println(val);
	}

}
