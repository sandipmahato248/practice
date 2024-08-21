package com.sandip.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpInEachDept {

	record Employee(String name, String dept, Integer salary) {

	}

	public static void main(String[] args) {
		List<Employee> emList = List.of(new Employee("Sandip", "CS", 1000), new Employee("Siru", "CS", 1500),
				new Employee("Sabin", "IT", 2000), new Employee("movek", "IT", 500),
				new Employee("Prince", "Finance", 100));
		
		var highestPaidEmpInEachDept = emList.stream()
				.collect(Collectors.groupingBy(Employee::dept,
				Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingInt(Employee::salary)), Optional::get)));
		System.out.println(highestPaidEmpInEachDept);
	}
}
