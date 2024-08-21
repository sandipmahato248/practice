package com.sandip.interview.prep.java8;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		
		String name = null;
		String checkName = Optional.ofNullable(name).orElse("default");
		System.out.println(checkName);
		
		// the main difference between orElse and orElseGet is that 
		//orElse calls for every request if the value is null or not
		//but orElseGet gets executed only if the first part is null
		
		String cName = Optional.ofNullable(name).orElseGet(() -> "default");
		System.out.println(cName);
		
//		String tName = Optional.ofNullable(name)
//				.orElseThrow(() -> new IllegalArgumentException("No value present"));
//		System.out.println(tName);
		
		Optional<String> test = Optional.ofNullable("sandip");
		Optional<String> test1 = Optional.empty();
		
		test.ifPresent((n) -> System.out.println("Name presetnt "+ n));
		test1.ifPresentOrElse(n->System.out.println("name present "+n),
				() -> System.out.println("Not present"));
		
		
		
	}


}
