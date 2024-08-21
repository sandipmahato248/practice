package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandip", 30);
		Employee emp2 = new Employee("Nishesh", 35);
		Employee emp3 = new Employee("Mukesh", 32);
		Employee emp4 = new Employee("Movek", 24);
		Employee emp5 = new Employee("Movek", 44);
		Employee emp6 = new Employee("Movek", 45);
		
		List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		
		//group by returns map
		Map<Integer, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
		map.forEach((k,v) -> System.out.println(k+" --->"+v));
		
		System.out.println("===========");
		
		//group by and collecting to set to remove duplicate, here name and age both are checked using hascode and equals
		Map<Integer, Set<Employee>> mapList = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(),Collectors.toSet()));
		mapList.forEach((k,v) -> System.out.println(k+" --->"+v));
		System.out.println("===========");
		
		//grouping by and using treeMap to sort 
		Map<Integer, Set<Employee>> map1 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(),TreeMap::new,Collectors.toSet()));
		map1.forEach((k,v) -> System.out.println(k+" --->"+v));
		
		System.out.println("===========");
		
		//count no of word in string 
		String str = "hello Welcome to USA hello Welcome to Canada";
		
		Map<String, Long> data =Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		data.forEach((k,v) -> System.out.println("count no of words "+ k+" --->"+v));
		
		System.out.println("===========");
		
		
		//Using summaryStatics to find sum, max, min, count, average,etc.
		List<Integer> iList = empList.stream().map(Employee::getAge).collect(Collectors.toList());
		
		DoubleSummaryStatistics stat = iList.stream().mapToDouble(x -> x).summaryStatistics();
		System.out.println(stat.getSum());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getAverage());
		System.out.println(stat.getCount());
		
		System.out.println("==========");
		
		//highest age of employee by name
		List<Employee> list = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName))
				.values()
				.stream()
				.map(e -> e.stream().max(Comparator.comparing(Employee::getAge)).orElse(null))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
		
		
		
		
		
		
	}

}
