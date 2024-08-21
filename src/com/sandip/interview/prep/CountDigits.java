package com.sandip.interview.prep;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDigits {

	public static void main(String[] args) {
		int num = 123456;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
		
		//using java8
		long digitCount = String.valueOf(123).chars().filter(Character::isDigit).count();
		System.out.println("Digit count= "+ digitCount);
		

		// using string length
		int digCount = String.valueOf(123).length();
		System.out.println("length= " + digCount);

		// count even and odd digits in number
		int orgNum = 123567;
		int eCount = 0;
		int oCount = 0;
		while (orgNum > 0) {
			int rem = orgNum % 10;
			if (rem % 2 == 0)
				eCount++;
			else
				oCount++;

			orgNum = orgNum / 10;
		}
		System.out.println(eCount + " " + oCount);

		// sum of digits
		int sum = 0;
		int oNum = 1234;
		while (oNum > 0) {
			sum = sum + oNum % 10;
			oNum = oNum / 10;
		}
		System.out.println(sum);
		//sum using stream 
		
		Integer sumOfDig = Stream.of(String.valueOf(1234).split(""))
			.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("sum of digit using stream "+sumOfDig);

		// find largest of 3 numbers
		int a = 10;
		int b = 40;
		int c = 30;
		int largest = a > b ? a : b;
		int nLargest = largest > c ? largest : c;
		System.out.println(nLargest);

		int large = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(large);

		// first & last digit
		int testNum = 1234;
		int lastDigit = testNum % 10;

		int firstDigit = testNum;
		while (firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}
		System.out.println(firstDigit + " " + lastDigit);

	}

}
