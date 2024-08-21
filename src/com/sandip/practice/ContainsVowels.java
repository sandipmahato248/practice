package com.sandip.practice;

public class ContainsVowels {
	
	public static void main(String[] args) {
		String name = "sandip";
		char[] array = name.toCharArray();
		char[] newArray = new char[name.length()];
		for(int i=0; i<array.length-1;i++) {
			if(array[i] == 'a' || array[i] =='e' 
					||array[i] == 'i'|| array[i] == 'o' || array[i]=='u')
				newArray[i] = array[i]; 
		}
		System.out.println(newArray);
		//System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
	
		
	}
	

}
