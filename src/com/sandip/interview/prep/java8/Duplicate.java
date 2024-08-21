package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Sandip", 30);
		Employee emp2 = new Employee("Nishesh", 30);
		Employee emp3 = new Employee("Mukesh", 32);
		Employee emp4 = new Employee("Movek", 24);
		Employee emp5 = new Employee("Movek", 24);

		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		List<Integer> iList = empList.stream().map(Employee::getAge).collect(Collectors.toList());
		// find duplicate elements from the list

		// here set uniqueData will give unique items and filtered data is duplicate
		// data
		Set<Integer> uniqueData = new HashSet<>();
		Set<Integer> duplicateData = iList.stream()
				.filter(p -> !uniqueData.add(p))
				.collect(Collectors.toSet());
		System.out.println(duplicateData);
		System.out.println("==========");

		// using grouping by
		Map<String, Long> filteredList = empList.stream().map(x -> x.getName())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<String> nameSet = filteredList.entrySet()
				.stream().filter((x) -> x.getValue() > 1).map(x -> x.getKey())
				.collect(Collectors.toSet());
		System.out.println(filteredList);
		System.out.println(nameSet);

		System.out.println("==========");

		// using frequency
		List<Employee> dList = empList.stream().filter(p -> Collections.frequency(empList, p) > 1)
				.collect(Collectors.toList());
		System.out.println(dList);

	}
}
