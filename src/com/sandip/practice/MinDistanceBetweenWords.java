package com.sandip.practice;

public class MinDistanceBetweenWords {
	public static void main(String[] args) {
		String s = "Hello welcome to java class";
		String w1 = "welcome";
		String w2 = "class";
		String[] arr = s.split(" ");
		int indexW1 =0;
		int indexW2 =0;
			
		for(int i =0; i<arr.length;i++) {
			if(w1.equals(arr[i])) {
				indexW1 = i;
			}
		}
		for(int j =0; j<arr.length;j++) {
			if(w2.equals(arr[j])) {
				indexW2 = j;
			}
		}
		System.out.println("Index of first word:"+indexW1+" second"+indexW2+
				" and min distance"+(indexW2-indexW1));
	}
	
	
	public static int minDistance(String str, String word1, String word2) {
		if (word1.equals(word2)) {
			return 0;
		}
		String words[] = str.split(" ");
		int minDistance = words.length + 1;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				for (int j = i; j < words.length; j++) {
					if (words[j].equals(word2)) {
						int curr = Math.abs(i - j) - 1;
						if (curr < minDistance)
							minDistance = curr;
					}
				}
			}
		}
		return minDistance;
	}

}
