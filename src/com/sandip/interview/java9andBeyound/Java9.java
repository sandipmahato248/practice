package com.sandip.interview.java9andBeyound;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java9 {
	public static void main(String[] args) {
		//filter takes predicate and acts like a gate that opens or closes per element
		//limit takes int and acts like a door and may close forever
		//skip takes int and it is closed and may open forever
		
		List<Integer> list = Arrays.asList(11,12,13,14,51,16,17,81,91);
		//takeWhile breaks after the predicate return true, here it will return only first 4 element
		//because the condition is only true for 4 element after that it breaks
		list.stream()
			.takeWhile(p -> p< 51)
			.forEach(System.out::println);
		System.out.println("======");
		//drops all the element and strats printing after 51 ie. 51,16,17,81,91
		list.stream().dropWhile(p -> p < 51).forEach(System.out::println);
		
		
		//iteration in imperative style 
		for(int i=0; i<=15; i=i+3) {
			System.out.println(i);
		}
		//functional style 
		//for(seed; Predicate: Function)
	//	IntStream.iterate(0, i->i<=15, i->i+3).forEach(System.out::println);
		//to print upto 18 
		IntStream.iterate(0, i->i+3)
				 .takeWhile(i -> i<=20)
				 .forEach(System.out::println);
		System.out.println("======");
		
		//optional ifPresentELse
		list.stream()
		.filter(e -> e > 100)
		.findFirst()
		.ifPresentOrElse(e -> System.out.println(e), () -> System.out.println("NO value"));
		
		
		Optional<Integer> res = list.stream()
									.filter(e -> e>50)
									.findFirst();
		System.out.println(res.get());
		
		//if you want to get the stream from the optional use stream() function at last
		Stream<Integer> result = list.stream()
				.filter(e-> e>50)
				.findFirst()
				.stream();
		result.forEach(System.out::println);
		
		//of function
		//to create immutable list use List.of/ Set.of / Map.of
		List<Integer> immutableList = List.of(1,2,3);
		immutableList.forEach(System.out::println);
		
		Set<Integer> immutableSet = Set.of(1,2,3);
		Map<Integer, String> immutableMap = Map.of(1,"sandip", 2,"movek");
		immutableMap.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
