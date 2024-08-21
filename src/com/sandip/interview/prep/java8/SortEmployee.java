package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandip", 30);
		Employee emp2 = new Employee("Nishesh", 30);
		Employee emp3 = new Employee("Mukesh", 32);
		Employee emp4 = new Employee("Movek", 24);
		Employee emp5 = new Employee("Movek", 24);

		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		
		//sort employee in asc order
		List<Employee> ascEmpList = empList.stream()
				.sorted((e1,e2) -> e1.getAge() - e2.getAge())
				.collect(Collectors.toList());
		System.out.println(ascEmpList);
		System.out.println("===========");
		
		//sort Desc order
		List<Employee> descEmpList = empList.stream()
				.sorted((e1,e2) -> e2.getAge() - e1.getAge())
				.collect(Collectors.toList());
		System.out.println(descEmpList);
		System.out.println("===========");
		
		
		//sort by name first then age
		empList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
		empList.forEach(System.out::println);
		System.out.println("===========");
		//get third highest age
		
		Employee thirdHighestAge = descEmpList.stream().skip(2).findFirst().get();
		System.out.println(thirdHighestAge);
		System.out.println("===========");
		
		//using collections.sort 
				Collections.sort(empList, (e1,e2) -> e2.getAge() - e1.getAge());
				System.out.println(empList);
		
		
	}

}
