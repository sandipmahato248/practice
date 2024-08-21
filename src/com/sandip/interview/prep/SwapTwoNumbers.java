package com.sandip.interview.prep;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 10; int b = 20; 
		System.out.println("Before swapping "+a +" "+b);
//1 Using third variable
//		int temp;
//		 temp = a;
//		 a = b;
//		 b = temp;
//		 System.out.println("After swapping "+a +" "+b);
		
		
// Using + & -
//		 a = a +b;
//		 b = a-b;
//		 a = a-b;
//		 System.out.println("After swapping "+a +" "+b);
		 
//using * $ /
//		 a = a*b;
//		 b = a/b;
//		 a = a/b;
//		 System.out.println("After swapping "+a +" "+b);
		 
//using expression
		 b = a+b - (a=b);
		 System.out.println("After swapping "+a +" "+b);
	}

}
