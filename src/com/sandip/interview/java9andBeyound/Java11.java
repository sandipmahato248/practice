package com.sandip.interview.java9andBeyound;

import java.util.List;
import static java.util.function.Predicate.not;

public class Java11 {
	public static void main(String[] args) {
		
		//var for lambda local variables
		//Optional.isEmpty()
		//readString(Path.of(pathOfFile)
		//writeString
		//Predicate not function
		//string changes lines, repeat, isBlank, strip(like trim but full-width spaces)
		
		List<Integer> list = List.of(1,2,3,4,5,6,7);
		list.stream()
			.filter(not(e -> e %2 == 0))
			.forEach(System.out::println);
	}

}
