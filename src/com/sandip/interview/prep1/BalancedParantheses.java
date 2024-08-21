package com.sandip.interview.prep1;

public class BalancedParantheses {

	public static void main(String[] args) {
		String str = "({[}]))";
		if (isBalanced(str)) {
			System.out.println("Balanced");
		} else {
			System.out.println("not");
		}
	}

	private static boolean isBalanced(String str) {
		int roundCount = 0;
		int curlyCount = 0;
		int squareCount = 0;

		for (Character ch : str.toCharArray()) {
			switch (ch) {
			case '(':
				roundCount++;
				break;
			case ')':
				roundCount--;
				break;
			case '{':
				curlyCount++;
				break;
			case '}':
				curlyCount--;
				break;
			case '[':
				squareCount++;
				break;
			case ']':
				squareCount--;
				break;
			}
		}
		if (roundCount < 0 || curlyCount < 0 || squareCount < 0) {
			return false;
		}
		return roundCount == 0 && curlyCount == 0 && squareCount == 0;
	}

}
