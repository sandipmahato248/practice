package com.sandip.test.w3global;

public class TestImprovement {
	
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< 1000000; i++){
			sb.setLength(0);
			sb.append("Iteration-");
			sb.append(i);
			String printStr = sb.toString();
			System.out.println(printStr);
		}
	}

}
