package com.sandip.interview.prep1;
//Write a java program to check if any number given as input is the sum of 2 prime numbers.
public class PrimeSum {
	
	public static void main(String[] args) {
		int n = 18;
		
			checkSum(n);
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2; i< n/2; i++) {
			if(n %i == 0)
				return false;
		} 
			return true;
	}
	
	private static void checkSum(int n) {
		for(int i=2; i< n/2; i++) {
			if(isPrime(i)) {
				if(isPrime(n-i)) { //check difference of n and current num is prime or not
					System.out.println(n +"="+ (n-i) +" "+i );
				}
			}
		}
	}

}
