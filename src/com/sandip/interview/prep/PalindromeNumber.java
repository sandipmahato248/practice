package com.sandip.interview.prep;

public class PalindromeNumber {
	//16461
	public static void main(String[] args) {
		int num = 16461;
		int orgNum = num;
		int rev = 0;
		while(num != 0) {
			rev = rev* 10 + num % 10;
			num = num /10;
		}
		
		if(orgNum == rev)
			System.out.println("Palindrome");
		else
			System.out.println("not");
	}
}
