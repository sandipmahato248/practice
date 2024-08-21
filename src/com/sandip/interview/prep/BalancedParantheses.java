package com.sandip.interview.prep;

import java.util.Stack;

public class BalancedParantheses {
	public static void main(String[] args) {
		String str = "([{}]))";
		Stack<Character> s = new Stack<>();
		for(int i=0; i< str.length(); i++) {
			char c = str.charAt(i);
			if(s.isEmpty())
				s.push(c);
			else if(c=='[' || c=='{' ||c =='(')
				s.push(c);
			else if(c==']' && s.peek() == '[')
				s.pop();
			else if(c=='}' && s.peek() == '{')
				s.pop();
			else if(c==')' && s.peek() == '(')
				s.pop();
		}
		if(s.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("not");
	}

}
