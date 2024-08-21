package rec;

import java.util.ArrayList;

public class Prac {
	//print num from 5 to 1
	public static void printNum(int n) {
		if(n==0) return;
		System.out.println(n);
		printNum(n-1);
		
	}
	
	//print num from 1 to 5;
	public static void printNumFrom(int n) {
		if(n==6) return;
		System.out.println(n);
		printNumFrom(n+1);
	}
	
	// sum of first n natural numbers
	public static void sumN(int i, int n,int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
			sum+= i;
		sumN(i+1,n,sum);
	}
	
	//factorial
	public static int fact(int n) {
		if(n==0 || n==1) return 1;
		return n* fact(n-1);
	}
	
	
	//fibo
	public static void fibo(int a, int b, int n) {
		if(n==0) {
			return;
		}
		int c = a +b;
		System.out.println(c);
		fibo(b,c,n-1);
	}
	
	public static int calcPow(int base,int pow) {
		if(base == 0) return 0;
		if(pow ==0) return 1;
		return base * calcPow(base,pow-1);
	}
	
	public static void reverseString(String str,int index) {
		if(index == 0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.println(str.charAt(index));
		reverseString(str,index-1);
	}
	
	public static void revNum(int n) {
		if(n<10) {
			System.out.println(n);
			return;
		}
		System.out.println(n%10);
		revNum(n/10);
	}
	
	//count down to zero
	public static void countDown(int n) {
		if(n==0) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		countDown(n-1);
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		return gcd(num2,num1%num2);
	}
	
	public static int sumOfDigits(int n) {
		if(n==0) return 0;
		return (n%10+sumOfDigits(n/10));
	}
	
	public static void permString(String str, String perm) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i)+ str.substring(i+1);
			permString(newStr,perm+currChar);
		}
	}
	
	public static void decToBin(int dec,String result) {
		if(dec == 0) {
			System.out.println(result);
			return;
		}
		result = dec %2 + result;
		decToBin(dec/2,result);
	}
	
	public static void towerOfHanoi(int n,String src,String helper, String dest) {
		if(n==1) {
			System.out.println("transfer disk "+n+" from src "+src+" to dest "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("transfer disk "+n+" from src "+src+"to dest "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}
	
	public static int first = -1;
	public static int last = -1;
	public static void findOccurance(String str,int index,char element) {
		if(index == str.length()) {
			System.out.println(first +" "+ last);
			return;
		}
		char currChar = str.charAt(index);
		if(currChar == element) {
			if(first == -1)
				first = index;
			else
				last = index;
		}
		findOccurance(str, index+1, element);
		
	}
	
	public static boolean isSorted(int arr[],int index) {
		if(index == arr.length-1) return true;
		if(arr[index]< arr[index+1]) 
			return isSorted(arr,index+1);
		else return false;
		
	}
	
	public static void moveAllX(String str,int index,int count,String newStr) {
		if(index == str.length()) {
			for(int i=0;i<count;i++) {
				newStr +='X';
				
			}
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(index);
		if(currChar == 'X') {
			count++;
			moveAllX(str,index+1,count,newStr);
		}else {
			newStr+=currChar;
			moveAllX(str,index+1,count,newStr);
		}
			
	}
	
	public static boolean[] map = new boolean[26];
	public static void removeDuplicates(String str,int index,String newStr) {
		if(index == str.length()) {
			System.out.println(newStr);
			return;
		}
			
		char currChar = str.charAt(index);
		if(map[currChar - 'a']) {
			removeDuplicates(str, index+1, newStr);
		}else {
			newStr+=currChar;
			map[currChar -'a'] = true;
			removeDuplicates(str, index+1, newStr);
		}
		
	}
	
	public static void subSequence(String str,int index, String newStr) {
		if(index == str.length()) {
			System.out.println(newStr);
			return;
		}
		char currChar = str.charAt(index);
		subSequence(str, index+1, newStr+currChar);
		subSequence(str, index+1, newStr);
	}
	
	//print subset
	public static void printSubset(ArrayList<Integer> subset) {
		for(int i =0;i<subset.size();i++) {
			System.out.println(subset.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void findSubSet(int n, ArrayList<Integer> subset) {
		if(n==0) {
			printSubset(subset);
			return;
		}
		subset.add(n);
		findSubSet(n-1, subset);
		
		subset.remove(subset.size()-1);
		findSubSet(n-1, subset);
	}
	
	
	
	//linkedlist reverse
//	public static Node reverseList(Node head) {
//		if(head == null || head.next == null ) return head;
//		Node p = reverseList(head.next);
//		head.next.next = head;
//		head.next = null;
//		return p;
//		
//	}
	
	
	public static void main(String[] args) {
		//printNum(5);
		//printNumFrom(1);
		//sumN(1,5,0);
		//System.out.println(fact(5));
		
//		int a = 0, b = 1, n=7;
//		System.out.println(a+" "+b);
//		fibo(a,b,n-2);
		
	//	System.out.println(calcPow(2,5));
		
//		String str = "sandip";
//		reverseString(str,str.length()-1);
		
		//revNum(123);
		//countDown(5);
		
	//	System.out.println(gcd(24,56));
		
		//System.out.println(sumOfDigits(123));
		
		//permString("abc", "");
		//decToBin(5,"");
		//towerOfHanoi(3, "S", "D", "H");
		//findOccurance("abdcdsadd", 0, 'd');
	
//		int arr[] = new int[]{4,2,3};
//		System.out.println(isSorted(arr,0));
		
		//moveAllX("abcXdcdXddXasd", 0, 0, "");
		//removeDuplicates("sandipsa", 0, "");
		subSequence("a", 0, "");
	}
	


}
