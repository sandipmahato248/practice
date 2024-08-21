package rec;

import java.util.ArrayList;

//questions from ac vd6
public class Recursion {
	//print all permutaion of string
	public static void printPerm(String str, String perm) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length();i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
			printPerm(newStr,perm+currChar);
			
		}
	}
	
	// count total no of paths 
	public static int countPaths(int i, int j,int n,int m ) {
		if(i==n || j==m) {
			return 0;
		}
		
		if(i == n-1 && j == m-1) {
			return 1;
		}
		int totalDownPaths = countPaths(i+1,j,n,m);//move downwards
		int totalRightPaths = countPaths(i,j+1,n,m);//move right
		return totalDownPaths + totalRightPaths;
	}
	
	//place tiles
	public static int placeTiles(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m){
			return 1;
		}
		
		int verticalPlacements = placeTiles(n-m,m);
		int horizontalPlacements = placeTiles(n-1,m);
		return verticalPlacements + horizontalPlacements;
	}
	
	// call guest in single or pairs
	public static int callGuest(int n) {
		if(n<=1) {
			return 1;
		}
		
		int singleWay = callGuest(n-1);
		int pairsWay = (n-1)*callGuest(n-2);
		return singleWay + pairsWay;
	}
	
	//print subset of natural numbers
	public static void printSubset(ArrayList<Integer> subset) {
		for(int i =0; i< subset.size();i++) {
			System.out.println(subset.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void findSubsets(int n, ArrayList<Integer> subset) {
		if(n == 0) {
			printSubset(subset);
			return;
		}
		
		subset.add(n);
		findSubsets(n-1,subset);
		
		
		subset.remove(subset.size()-1);
		findSubsets(n-1, subset);
	}
	
	//tower of hanoi
	public static void towerOfHanoi(int n,String src,String helper,String dest) {
		
		if(n==1) {
			System.out.println("transfer disk "+n+" from "+src+" dest "+dest);
			return;
		}
		
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("transfer disk "+n+" from "+src+" dest "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}
	
	//print string in reverse
	public static void printReverse(String str,int index) {
		if(index == 0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.println(str.charAt(index));
		printReverse(str,index-1);
		
	}
	
	//first and last occurance of element in string
	public static int first = -1;
	public static int last = -1;
	public static void findOccurance(String str, int idx,char element) {
		if(idx == str.length()) {
			System.out.println(first+" "+last);
			return;
		}
		
		char currChar = str.charAt(idx);
		if(currChar == element) {
			if(first == -1) {
				first = idx;
			}else {
				last = idx;
			}
		}
		
		findOccurance(str, idx+1, element);
	}
	//strictly sorted
	public static boolean isSorted(int arr[],int idx) {
		if(idx == arr.length-1)
			return true;
		
		if(arr[idx] < arr[idx+1])
			return isSorted(arr,idx+1);
		else return false;
	}
	
	
	//move all x to end
	public static void moveAllX(String str, int idx,int count,String newStr) {
		if(idx == str.length()) {
			for(int i=0;i< count;i++) {
				newStr+= 'x';
			}
			System.out.println(newStr);
			return;
		}
		char currChar = str.charAt(idx);
		if(currChar == 'x') {
			count++;
			moveAllX(str, idx+1, count, newStr);
		}else {
			newStr += currChar;
			moveAllX(str, idx+1, count, newStr);
		}
		
		
	}
	
	//remove all duplicates
	public static boolean[] map = new boolean[26];
	public static void removeDuplicates(String str, int idx,String newStr) {
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(idx);
		if(map[currChar - 'a'])
			removeDuplicates(str,idx+1,newStr);
		else {
			newStr +=currChar;
			map[currChar -'a'] = true;
			removeDuplicates(str,idx+1,newStr);
		}
			
	}
	
	//print subsequences of string
	
	public static void subsequence(String str,int idx, String newStr) {
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(idx);
		subsequence(str, idx+1, newStr+currChar);
		subsequence(str, idx+1, newStr);
	}
	

	public static void main(String [] args) {
		printPerm("abc","");
		int totalPaths = countPaths(0,0,3,3);
		System.out.println(totalPaths);
		
		int totalTiles = placeTiles(4,2);
		System.out.println(totalTiles);
		
		int totalWays = callGuest(4);
		System.out.println(totalWays);
		
		ArrayList<Integer> subset = new ArrayList<Integer>();
		findSubsets(3, subset);
		
		towerOfHanoi(3,"S","H","D");
		
		String str = "abcd";
		printReverse(str,str.length()-1);
		
		findOccurance("wqabcdeaabceaal", 0, 'a');
		
		int arr[] = {1,2,5};
		
		System.out.println(isSorted(arr,0));
		
		moveAllX("axbcxxd", 0, 0, "");
		
		removeDuplicates("abbaccd",0,"");
		
		subsequence("abc", 0, "");
	} 

}
