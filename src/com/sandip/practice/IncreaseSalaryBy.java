package com.sandip.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IncreaseSalaryBy {

	record Employee(String name, Integer age, Double salary) {

	}
	record Employee1(String name, String dept, Double salary) {}

	public static void main(String[] args) {
		List<Employee> eList = List.of(new Employee("Sandip", 20, 1000.0),
				new Employee("Siru", 29, 1500.0),
				new Employee("Sabin", 30, 2000.0), 
				new Employee("movek", 20, 500.0),
				new Employee("Prince", 23, 100.0));
		
		// increase salary of employee by 10% whose age is greater than 25
		List<Employee> list = eList.stream().
				filter(e -> e.age() > 25)
				.map(e -> {
					Double sal = e.salary + e.salary * 0.1;
					return new Employee(e.name, e.age, sal);
				}).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("=================");
		
		System.out.println("=================");
		
		// create hashMap and sort the hash map with values
		Map<Integer, String> map = Map.of(1, "sandip", 2, "siru", 3, "movek", 4, "nishesh", 5, "rupesh");
		
		LinkedHashMap<Integer, String> linkedMap= map.entrySet()
				.stream()
				.sorted((o1,o2) -> o1.getValue().compareTo(o2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
									(e1,e2) ->e1, LinkedHashMap::new ));
		System.out.println(linkedMap);
		System.out.println("=================");
		
		//check all the palindrome words
		String input = "My name is nitin and I can speak malayalam";
		
		List<String> palindromList = Stream.of(input.split(" "))
				.filter(IncreaseSalaryBy::isPalindrom)
				.collect(Collectors.toList());
		System.out.println(palindromList);
		System.out.println("=================");
		
		//group employee by age
		Map<Integer, List<Employee>> groupList = eList.stream()
				.collect(Collectors.groupingBy(Employee::age));
		System.out.println(groupList);
		System.out.println("=================");
		
		//check given number is armstrong or not
		//input 153 
		// 1^3 + 5^3 + 3^3
		System.out.println(checkArmstrong(153));
		System.out.println(checkArmstrong(1634));
		System.out.println("=================");
		
		//print number 1 to 100 without using number
		int one = "a".length();
		int ten = "aaaaaaaaaa".length();
		for(int i= one ; i<= (ten * ten ); i++) {
			// System.out.println(i);
		}
		
		//identify the duplicate numbers
		List<Integer>  nList = List.of(10,20,10,20,30,40);
		
		Set<Integer> dupList = nList.stream()
		.filter(e -> Collections.frequency(nList, e) >1 )
		.collect(Collectors.toSet());
		System.out.println(dupList);
		
		Set<Integer> uniqueSet = new HashSet<>();
		Set<Integer> sList = nList.stream().filter(e -> !uniqueSet.add(e))
				.collect(Collectors.toSet());
		System.out.println(sList);
		
		Map<Integer, Long> mMap = nList.stream()
				.collect(Collectors.groupingBy(Function.identity(),
									Collectors.counting()));
		Set<Integer> mSet = mMap.entrySet().stream()
		.filter(e -> e.getValue() > 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		System.out.println(mSet);
		System.out.println("=================");
		
		//find the max number in list
		List<Integer> aList = Arrays.asList(3,2,2,3,7,9,5);
		Integer maxNum =aList.stream()
				.sorted((a,b) -> b-a)
				.findFirst()
				.orElseThrow(() -> new NoSuchElementException("Element not found"));
		System.out.println(maxNum);
		
		Integer maxVal = aList.stream()
							.collect(Collectors.maxBy(Comparator.naturalOrder()))
							.orElse(0);
		
		Integer val = aList.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxVal+" "+val);
		System.out.println("=================");
		
		//print 10 Random numbers
		Random rm = new Random();
		rm.ints(1,100).limit(10).sorted().forEach(System.out::println);
		System.out.println("=================");
		
		//find number starts with
		List<Integer> numberList = Arrays.asList(1,2,3,4,11,13,41,22);
		numberList.stream()
				.map(e -> e +"")
		        .filter(e -> e.startsWith("1"))
		        .forEach(System.out::println);
		
		//find the reverse number
		int num = 123;
		int rev = 0;
		while(num != 0) {
			rev = rev *10 + num %10;
			num /= 10;
		}
		System.out.println("rev "+ rev);
		StringBuilder sb = new StringBuilder(String.valueOf(123));
		String revNum = sb.reverse().toString();
		System.out.println("re "+revNum);
		System.out.println("=================");
		
		

	}
	
	private static boolean isPalindrom(String input) {
		StringBuilder sb = new StringBuilder(input);
		String revStr = sb.reverse().toString();
		if(input.equals(revStr))
			return true;
		return false;
	}
	
	private static boolean checkArmstrong(int num) {
		int orgNum = num;
		int sum = 0;
		int numOfDigits = String.valueOf(num).length();
		while(orgNum > 0) {
			int digit = orgNum %10;
			sum = (int) (sum + Math.pow(digit, numOfDigits));
			orgNum /= 10;
		}
		
		if(sum == num)
			return true;
		
		return false;
	}

}
