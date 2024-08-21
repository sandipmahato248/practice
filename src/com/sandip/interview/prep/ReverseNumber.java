package com.sandip.interview.prep;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		
// using stringbuffer
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		sb.reverse();
//		System.out.println(sb);
		
//using stringbuilder
//		StringBuilder sbd = new StringBuilder();
//		sbd.append(num);
//		sbd.reverse();
//		System.out.println(sbd);
		
	}

}
