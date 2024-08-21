package com.sandip.interview.java9andBeyound;


public class Java12 {
	public static void main(String[] args) {
		//Switch 
		//can return value from the switch
		// yeild is used to return the value from the switch
		
		String greet = "hi";
		
		String result = switch(greet) {
		case "hi" -> {
			yield "Hi there";
		}
		case "hello" -> "Hello there";
		 default ->"default";
		};
		
		System.out.println(result);
	}

}
