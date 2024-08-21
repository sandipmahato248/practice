package com.sandip.practice;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		int num = 371;
		int orginalNum;
		int remainder;
		int sum= 0;
		
		orginalNum = num;
		
		while(orginalNum !=0) {
			remainder = orginalNum % 10;
			sum = (int) (sum + Math.pow(remainder, 3));
			orginalNum = orginalNum / 10;
			
		}
		if(sum == num) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not");
		}
	}
	
	

}
