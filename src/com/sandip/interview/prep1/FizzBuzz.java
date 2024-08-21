package com.sandip.interview.prep1;
// if mulitple of 3 print fizz , if multiple of 5 print buzz
// if multiple of 3 and 5 print fizzbuzz
public class FizzBuzz {
	public static void main(String[] args) {
		printResult(100);
		
	}

	private static void printResult(int n) {
		for(int i=1; i<=n; i++ ) {
			if((i%3==0) && (i%5 == 0))
				System.out.println("fizzBuzz");
			else if(i%3==0)
				System.out.println("fizz");
			else if(i%5==0)
				System.out.println("buzz");
			else 
				System.out.println(i);
		}
	}

}
