package com.sandip.interview.prep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



//groupingBy and mapping(Function,Collectors)
//collectionAndThen (Collectors,Function)
//teeing(Collectors,Collectors, operation)	

//if you have one to one function, use map to go from Stream<T> to Stream<<R>>
//if you have one to many function, use map to go from Stream<T> to Stream <Collection<R>>
//if you have one to many function, use flatMap to go from Stream<T> to Stream <<R>>


public class PersonMain {
	
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Sandip","Male",20),
				new Person("Nishesh","Male",32),
				new Person("Nishesh","Male",33),
				new Person("Movek", "Male", 22),
				new Person("Movek", "Male", 20),
				new Person("Siru","Female",29),
				new Person("Meera","Female",33),
				new Person("Reema","Female",25)
				);
		
		//create a map with the name and age as key, and the person as a value
		Map<String, Person> nameAge = personList.stream()
				.collect(Collectors.toMap(p -> p.getName()+"-"+ p.getAge(), p->p));
		System.out.println(nameAge);
		System.out.println("===========");
		
		//group by name and the value should be list of integers
		Map<String, List<Integer>> ageByName = personList.stream()
				.collect(Collectors.groupingBy(Person::getName,
						Collectors.mapping(Person::getAge,Collectors.toList())));
		System.out.println("ageByName " +ageByName);
		System.out.println("===========");
		
		
		//groupingBy and mapping(Function,Collectors)
		//collectionAndThen (Collectors,Function)
		
		//if i use counting() it will give long 
		//if i want the name as key and value should be integer then use collectingAndThen
		Map<String, Integer> collectingAndCountingInInteger = personList.stream()
				.collect(Collectors.groupingBy(Person::getName, 
						Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
		System.out.println(collectingAndCountingInInteger);
		
		System.out.println("===========");
		
		//name of max age person 
		String maxAgeName = personList.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Person::getAge)), 
					//	person -> person.get().getName()));
						person -> person.map(Person::getName).orElse(" ")));
		
		//first we need collectingAndThen and find maxBy passing compartor 
		//and we need to map the given person because its optional
		System.out.println("max age name "+maxAgeName);
		
		var	maxAgePerson1 = personList.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.map(Person::getName)
				.findFirst().get();
		System.out.println(maxAgePerson1);
		System.out.println("===========");
		
		//do mapping and filtering in the middle of transformation
		Map<Integer, List<String>> ex = personList.stream()
				.collect(Collectors.groupingBy(Person::getAge,
						Collectors.mapping(Person::getName, 
								Collectors.filtering(e -> e.length()<5, Collectors.toList()))));
		System.out.println(ex);
		System.out.println("===========");
		
		//given a list return all the char of the name
		List<String> cList = personList.stream()
				.map(Person::getName)
				.flatMap(name -> Stream.of(name.split("")))
				.collect(Collectors.toList());
		System.out.println("clist "+cList);
		
		
		System.out.println("===========");
		
		//given a list group by age and then return the names as character in the list
		Map<Integer, List<String>> charList = personList.stream()
				.collect(Collectors.groupingBy(Person::getAge,
						Collectors.flatMapping(
								p-> Stream.of(p.getName().split("")), 
								Collectors.toList())));
		System.out.println("charlist "+charList);
		System.out.println("===========");
		
		//given a list group by age and then return the unique chars in uppercase 
		Map<Integer, Set<String>>  uniqueCharListByAge = personList.stream()
		.collect(Collectors.groupingBy(Person::getAge,
				Collectors.mapping(p -> p.getName().toUpperCase(),
						Collectors.flatMapping(name -> Stream.of(name.split("")),
								Collectors.toSet()))));
		System.out.println("uniqueCharListByAge "+uniqueCharListByAge);
		
		
		
		System.out.println("===========");
		//compare by age and then name
		List<Person> pList =personList.stream()
		.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
		.collect(Collectors.toList());
		
		System.out.println("pList "+pList);
		System.out.println("===========");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//double first even numbers greater than 3
		List<Integer> evenList = list.stream().filter(p -> p>3)
		.filter(e -> e %2 ==0)
		.map(e -> e *2)
		.collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println("===========");
		
		//get the list of names in uppercase whose age is older than 30
		List<String> ageList = personList.stream()
				.filter(e -> e.getAge() > 30)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toUnmodifiableList());
		System.out.println(ageList);
		System.out.println("===========");
		
		//create a comma seprated name in uppercase of people older than 30
		String commaSepratedNames = personList.stream()
		.filter(e -> e.getAge() > 30)
		.map(e -> e.getName())
		.map(String::toUpperCase)
		.collect(Collectors.joining(","));
		System.out.println(commaSepratedNames);
		System.out.println("===========");
		
		//split into even and odd number age
		Map<Boolean, List<Person>> splittedAge = personList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() %2 == 0));
		System.out.println(splittedAge);
		System.out.println("===========");
		
		
		
		
		
		
		
				
				
	}

}
