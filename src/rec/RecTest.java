package rec;

import java.util.List;

public class RecTest {
	
	//downcount
	public static int downCount(int n) {
		if(n == 0 || n < 0)
			return 0;
		System.out.println(n+" ");
		return downCount(n-1);
	}
	
	//find length of string
	public static int lengthStr(String str) {
		if(str == null || str == "")
			return 0;
		return 1 + lengthStr(str.substring(1));
	}
	
	//print characters in reverse
	public static void printCharInReverse(String str) {
		if(str == null || str =="")
			return;
		printCharInReverse(str.substring(1));
		System.out.println(str.charAt(0));
	}
	
	public static int factorial(int n) {
		if(n==0 || n==1) return 1;
		return n*factorial(n-1);
	}
	
	//rec way find min from list
	public static Integer findMin(List<Integer> list) {
		if(list == null || list.isEmpty()) return null;
		return recFindMin(list,0);
		
	}
	public static Integer recFindMin(List<Integer> list, int index) {
		Integer first = list.get(index);
		if(index == (list.size()-1)) return first;
		Integer recFind = recFindMin(list, index+1);
		if(first.compareTo(recFind) < 0) return first;
		else return recFind;
	}
	
	//nxt way to find min from list
	public static Integer findMin1(List<Integer> list) {
		if(list == null || list.isEmpty()) return null;
		return recFindMin1(list);
		
	}
	public static Integer recFindMin1(List<Integer> list) {
		Integer first = list.remove(0);
		if(list.isEmpty()) return first;
		Integer recFind = recFindMin1(list);
		return recFind.compareTo(first) < 0 ? recFind : first;
	}
	
	static StringBuilder sb = new StringBuilder();
	
	public static String merge(String s1,String s2) {	
		if(s1.isEmpty() && s2.isEmpty()) return sb.toString();
		if(s1.isEmpty()) {
			sb.append(s2);
			return sb.toString();
		}
		if(s2.isEmpty()) {
			sb.append(s1);
			return sb.toString();
		}

		if(s1.charAt(0) <= s2.charAt(0)) {
			sb.append(s1.charAt(0));
			return merge(s1.substring(1),s2);
		}
		else {
			sb.append(s2.charAt(0));
			return merge(s1,s2.substring(1));
		}
	}
	
	

	
	
	
	public static void main(String[] args) {
		downCount(5);
		//System.out.println(lengthStr("sandip"));
		//printCharInReverse("sandip");
		System.out.println(merge("ace", "bd"));
		//List<Integer> list = List.of(1,2,3,4,5);
		//System.out.println(findMin(list));
		//System.out.println(findMin1(list));
	}

}
