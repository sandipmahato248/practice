package com.sandip.practice;

public class FiboSeq {
	
	public static void main(String[] args) {
		int a =0; int b=1; int c=1; int num =10;
		System.out.println(a);
		for(int i=1; i<num;i++) {
			c = a+b;
			System.out.println(b);
			a = b;
			b=c;
		}
		
	}

}
