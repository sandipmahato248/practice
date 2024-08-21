package com.sandip.interview.java9andBeyound;

public class PersonRecord {
	//records are immutable
	
	record Person(String name, String address) {
		
	}
	
	public static void main(String[] args) {
		Person p = new Person("Sandip","Damak");
		System.out.println(p);
		
	}

}
