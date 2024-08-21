package com.sandip.practice;

import java.util.Stack;

public class BalancedParantheses {
	public static void main(String[] args) {
		String exp = "[{(])}";
		char[] arr = exp.toCharArray();
		
		Stack<Character> stack = new java.util.Stack<>();
		
		for(int i=0; i<arr.length;i++) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
			}else if(arr[i] =='[' || arr[i] =='{' || arr[i] =='(')
				stack.push(arr[i]);
			else if (arr[i] == ']' && stack.peek() == '[' ) 
				stack.pop();
			else if (arr[i] == '}' && stack.peek() == '{' ) 
				stack.pop();
			else if (arr[i] == ')' && stack.peek() == '(' ) 
				stack.pop();
		}
		if(stack.isEmpty())
			System.out.println("Balanced");
		else {
			System.out.println("not");
		}
	}

}
