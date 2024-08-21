package com.sandip.practice;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctDept {
	
	record Employee(String name, Integer age, String gender, String dept) {}
	
	public static void main(String[] args) {
		var eList =List.of(
				new Employee("Sandip",20,"Male","IT"),
				new Employee("Siru",25,"Female","HR"),
				new Employee("rupa",30,"Female","IT"),
				new Employee("Nishesh",35,"Male","HR")
				);
		//print the distinct dept in emp list
		
		eList.stream()
		.map(Employee::dept)
		.distinct()
		.forEach(System.out::println);
		System.out.println("=============");
		
		//count of employee in each dept
		var countMap = eList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.counting()));
		System.out.println(countMap);
		System.out.println("=============");
		
		//average age of male and female emp
		var averageAge = eList.stream()
		.collect(Collectors.groupingBy(Employee::gender,    
				 Collectors.averagingDouble(Employee::age)));
		System.out.println(averageAge);
		
	}

}
