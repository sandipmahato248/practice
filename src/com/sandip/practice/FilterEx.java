package com.sandip.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterEx {
	
	record Patient(String name, Integer age, String disease, Integer amount) {
		
	}
	
	public static void main(String[] args) {
		List<Patient> pat = Arrays.asList(
				new Patient("Sandip",20,"Corona",100),
				new Patient("Siru",25,"Corona",200),
				new Patient("rupa",30,"Fever",300),
				new Patient("Nishesh",35,"Corona",400)
				);
		
		//print the list of patient who have corona
		pat.stream().filter(e -> e.disease.equalsIgnoreCase("Corona")).forEach(System.out::println);
		System.out.println("=========");
		
		//print the list of pat who have corona and age is greater than 25
		
		pat.stream().filter(e -> e.disease.equalsIgnoreCase("Corona") && e.age >=25).
		forEach(System.out::println);
		
		System.out.println("=========");
		
		
		//average bill of corona patient
		Double averageBill = pat.stream()
			.filter(p -> p.disease.equalsIgnoreCase("Corona"))
		    .collect(Collectors.averagingDouble(Patient::amount));
		System.out.println(averageBill);
		
		
		
	}

}
