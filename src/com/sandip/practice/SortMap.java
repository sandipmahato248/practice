package com.sandip.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 3);
		map.put("c", 2);
		map.put("b", 1);
		
		//sort based on values
		LinkedHashMap<String,Integer> sortedMap= map.entrySet().stream()
				.sorted((e1,e2)->e1.getValue()-e2.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, 
						Map.Entry::getValue, 
						(e1,e2) -> e1, LinkedHashMap::new));
	    System.out.println(sortedMap);
	    
	    String str = "racecar";
	    boolean status = checkPalindrome(str);
	    System.out.println("status "+status);
	    
	  //starts with 1 
	    List<Integer> numbers = Arrays.asList(10,12,34,23,14);
	    numbers.stream().map(s-> s+"").filter(p->p.startsWith("1")).forEach(System.out::println);
	   // numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	    
	    //reverse the number
	    int num = 123;
	    int rev =0;
	    while(num>0) {
	    	int rem = num %10; 
	    	rev = rev *10+rem;
	    	num = num/10;
	    }
	    System.out.println(rev);
	
	}
	
	//check palindrome in string
	private static boolean checkPalindrome(String str) {
		if(str == null) return false;
		int left =0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
		
	}
	
	//starts with 1 

}
