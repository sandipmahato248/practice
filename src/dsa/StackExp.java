package dsa;

import java.util.Stack;

public class StackExp {
	private String expression;
	
	 public StackExp(String exp) {
		 this.expression = exp;
	 }
	 
	 public boolean isExpressionValid(String exp) {
		 int len = exp.length();
		 Stack<Character> s = new Stack();
		 char ch, chx;
		 boolean valid = false;
		 for(int i=0;i<len;i++) {
			 ch = exp.charAt(i);
			 if(ch=='[' || ch== '{' || ch == '(')
				 s.push(ch);
			 if(ch==']' || ch=='}' || ch==')') {
				 if(s.isEmpty())
					  valid = false;
				 else {
					 chx = s.pop();
					 if((chx == '[' && ch ==']') || (chx == '{' && ch=='}') 
							 || (chx =='(' && ch==')'))
						 valid = true;
					 else {
						 valid = false;
						 return valid;
					 }
				 }
			 }
		 }
		 if(!s.isEmpty())
			 valid = false;
		 return valid;
		 
	 }
	 
	 public static void main(String[] args) {
		String exp = "(a+b)+(b-c))";
		StackExp e = new StackExp(exp);
		System.out.println(e.isExpressionValid(exp));
	}

}
