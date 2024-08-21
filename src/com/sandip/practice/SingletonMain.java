package com.sandip.practice;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2)
			System.out.println("Same instance");
		else
			System.out.println("not");
		
		
	}

}
