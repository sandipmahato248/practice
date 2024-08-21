package com.sandip.interview.prep.java8;

import java.lang.StackWalker.Option;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee1Main {
	public static void main(String[] args) {
		List<Employee1> list = Employee1.createDummyData();
		list.add(new Employee1(11, "sandip", 20, "Male", "Department0", 2001, 55000.0));
	
		//count male and females  employee in organization
		Map<String, Long> cMap= list.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
		cMap.forEach((k,v) -> {
			System.out.println("Gender = "+k+" count= "+v);
		});
		System.out.println("=============");
		
		
		//find average age of Male and Female
		Map<Object, Double> aMap = list.stream()
				.collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingInt(Employee1::getAge)));
		System.out.println(aMap);
		System.out.println("=============");
		
		
		//print all department in organization
		list.stream()
		.map(Employee1::getDepartment)
		.distinct()
		.forEach(System.out::println);
		System.out.println("=============");
		
		
		//highest paid employee in org
		Optional<Employee1> l=list.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
		if(l.isPresent()) System.out.println(l.get());
		System.out.println("=============");
		
		//print employee names who joined before 2014
		List<String> joinedList =list.stream().filter(e-> e.getYearOfJoining() < 2014)
				.map(Employee1::getName)
				.collect(Collectors.toList());
		joinedList.forEach(System.out::println);
		System.out.println("=============");
		
		//count the employee in each dept
		Map<String, Long> countInEachDept= list.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
		countInEachDept.forEach((k,v) -> {
					System.out.println("Dept = "+k+" count= "+v);
				});
		
		System.out.println("=============");
		
		
		//find highest paid employee in each dept
		List<Employee1> highestPaidEmp = list.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment))
				.values()
				.stream()
				.map(dept -> dept.stream()
						.max(Comparator.comparing(Employee1::getSalary)).orElse(null)
						)
				.collect(Collectors.toList());
		highestPaidEmp.forEach(System.out::println);
		System.out.println("=============");
		
		
		//average salary of each dept
		Map<String, Double> avSalList = list.stream()
		.collect(Collectors.groupingBy(Employee1::getDepartment,
				Collectors.averagingDouble(Employee1::getSalary)));
		avSalList.forEach((k,v) -> {
			System.out.println("Dept = "+k+" salary= "+v);
		});
		System.out.println("=============");
		
		
		//same salary employee in org 
		Map<Double, List<Employee1>> sameSalList = list.stream()
				.collect(Collectors.groupingBy(Employee1::getSalary,
						Collectors.toList()));
		sameSalList.forEach((k,v) -> {
			if(v.size()>1)
				System.out.println("k " +k+" v"+v);
		});
		System.out.println("=============");
		
		// youngest employee in org //both solution give same output
		Employee1 youngest = list.stream()
				.sorted((o1,o2) -> o1.getAge() - o2.getAge())
				.findFirst()
				.get();
		Optional<Employee1> youngest1 = list.stream().min(Comparator.comparing(Employee1::getAge));
		System.out.println(youngest1.get());
		System.out.println("=============");
		
		
		//youngest in dept1
		Optional<Employee1> youngestDept = list.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("Department1"))
				.min(Comparator.comparing(Employee1::getAge));
		System.out.println("youngest dept1 = "+youngestDept.get());
		System.out.println("=============");
		
		//oldest Employee
		Optional<Employee1> oldest = list.stream().max(Comparator.comparingInt(Employee1::getAge));
		System.out.println("oldest "+oldest);
		System.out.println("=============");
		
		//most work experience
		Employee1  mostWorkExp = list.stream().sorted(Comparator.comparingInt(Employee1::getYearOfJoining)).findFirst().get();
		System.out.println("most work exp "+ mostWorkExp);
		System.out.println("=============");
		
		//younger than 30 or equal to 30 and greater than 30
		//for this we have to use partitioning
		Map<Boolean,List<Employee1>> part = list.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() <=30));
			System.out.println(part);	
			

	}

}
