package com.sandip.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		List<Employee> eList = Arrays.asList(new Employee("E1", "IT", 1000), new Employee("E2", "IT", 2000),
				new Employee("E3", "Sales", 200), new Employee("E4", "Sales", 100));

		// grouping By Dept
		Map<String, List<Employee>> emp = eList.stream()
				.collect(Collectors.groupingBy(e1 -> e1.getDept()));
		System.out.println(emp.toString());

		// printing the highest salary from each dept
		Map<String, Employee> empSal = eList.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(), 
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())), 
								Optional::get)));
		System.out.println(empSal);

		// print all the distinct depts
		List<String> depts = eList.stream()
				.map(Employee::getDept)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(depts);

		// count the number of employess in each dept
		Map<String, Long> count = eList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(count);

		// average salary grouping by dept
		Map<String, Double> averageSalary = eList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, 
						Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalary);
		
		// no of frequency having length greater than equal to 2
		List<String> freqList = Arrays.asList("AA", "BB", "CC", "AA", "BB", "AA", "XX");
		Map<String, Long> freq = freqList.stream()
				.filter(p -> Collections.frequency(freqList, p) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freq);

		// String joiner pring A,B,C,P:Q
		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.add("A");
		sj.add("B");
		sj.add("C");
		System.out.println(sj);

		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("P");
		sj1.add("Q");
		System.out.println(sj1);
		System.out.println(sj.merge(sj1));

		// array intersection and union
		int[] arr1 = { 20, 35, 45, 60, 90 };
		int[] arr2 = { 10, 20, 45, 90, 95 };

		printIntersection(arr1, arr2);
		System.out.println("=======");
		printUnion(arr1, arr2);

		printSpecialChar("Sandip@#!");

		System.out.println(rotationOfTwoString("ABCD", "CDAB"));

		// find missing num from array
		int[] arr = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int arrSum = 0;
		int sum = (10 * 11) / 2;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		int missingNum = sum - arrSum;
		System.out.println("missing Num" + missingNum);

		// make the left middle lowerCase and rest uppercase
		String name = "My name is sandip My name is sandip";
		int mid = name.length() / 2;
		String lowCase = "";
		String upCase = "";
		for (int i = 0; i < name.length(); i++) {
			if (i < mid) {
				lowCase = lowCase + Character.toLowerCase(name.charAt(i));
			} else {
				upCase = upCase + Character.toUpperCase(name.charAt(i));
			}
		}
		System.out.println(lowCase + upCase);

		// count num of digits
		int digit = 12345;
		int count1 = 0;
		while (digit > 0) {
			count1++;
			digit = digit / 10;
		}
		System.out.println(count1);

		String st = "CloudTeCh";
		System.out.println(st.replaceAll("C", ""));
		String st1 = "";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != 'C') {
				st1 += st.charAt(i);
			}
		}
		System.out.println(st1);

		// compare two arrays
		int[] arr3 = { 2, 3, 5, 7 };
		int[] arr4 = { 3, 5, 2, 7 };
		System.out.println(compareArray(arr3, arr4));

		// bring all oddfirst and even last in array
		int[] arr5 = { 1, 2, 3, 4, 5, 6, 7 };
		printArr(arr5);

		// print string having same first and last char
		List<String> strList = Arrays.asList("ab", "aba", "pq", "pop", "xyx");
		strList.stream().filter(p -> p.length() > 0 && p.endsWith(String.valueOf(p.charAt(0))))
				.forEach(System.out::println);

		// count 0 and 1
		List<Integer> aList = Arrays.asList(0, 1, 0, 0, 1, 0, 1);

		int sum1 = aList.stream().reduce(0, Integer::sum);
		int zCount = aList.size() - sum1;
		System.out.println(sum1 + " " + zCount);

		// print by updating with total of array
		List<Integer> arList = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum2 = arList.stream().reduce(0, Integer::sum);
		arList.stream().map(p -> {
			return p + sum2;
		}).forEach(System.out::println);

		// uppercase joining with string
		List<String> stArr = Arrays.asList("india", "Usa", "France", "Italy");
		String resArr = stArr.stream()
				.map(p -> p.toUpperCase())
				.collect(Collectors.joining(","));
		System.out.println(resArr);

		printSubArray();

		String strs = "ab, cd, xyz";
		int scount = 0;
		for (int i = 0; i < strs.length(); i++) {
			if (strs.charAt(i) != ' ' && strs.charAt(i) != ',')
				scount++;
		}
		System.out.println(scount++);

		// swap two string
		String a = "cloud";
		String b = "tech";
		a = a + b; // cloudtech
		b = a.substring(0, a.length() - b.length()); // b=a-b
		a = a.substring(b.length());// a =a-b
		System.out.println(a + " " + b);

		// reverse num 1234
		int num1 = 1234;
		String rev = "";
		while (num1 > 0) {
			int rem = num1 % 10;
			rev = rev + rem;
			num1 = num1 / 10;
		}
		System.out.println(rev);

		// merge two array
		int[] arr0 = new int[] { 1, 2, 5, 7, 9 };
		int[] arr01 = new int[] { 3, 6, 10 };

		int[] mergedArr = new int[arr0.length + arr01.length];
		System.arraycopy(arr0, 0, mergedArr, 0, arr0.length);
		System.arraycopy(arr01, 0, mergedArr, arr0.length, arr01.length);
		Arrays.sort(mergedArr);
		for (int a1 : mergedArr) {
			System.out.println(a1);
		}

		// seprate positive and negative from array
		int[] wholeArr = new int[] { 1, 2, 5, -1, -3, 6, 8, -7 };
		int[] posArr = new int[wholeArr.length];
		int[] negArr = new int[wholeArr.length];
		int pindex = 0;
		int nindex = 0;

		for (int i = 0; i < wholeArr.length; i++) {
			if (wholeArr[i] > 0) {
				posArr[pindex] = wholeArr[i];
				pindex++;
			} else {
				negArr[nindex] = wholeArr[i];
				nindex++;
			}
		}
		System.out.println(Arrays.toString(posArr));
		System.out.println(Arrays.toString(negArr));

	//return true if all num are divisible by two
		List<Integer> iList = Arrays.asList(2,4,6,8);
		boolean test = iList.stream().allMatch(n->n%2==0);
		if(test)
			System.out.println("present");
		else
			System.out.println("not present");
		
	///intesection of arr using java8
		int[] fArr = new int[] {1,2,3,4};
		int [] sArr = new int[] {2,5};
		
		Arrays.stream(fArr)
		.filter(p->Arrays.stream(sArr).anyMatch(x->x==p))
		.distinct()
		.forEach(System.out::println);
		

	}

	// sub array whose sum is 3;ie. 1,2 & 3 total 2
	private static void printSubArray() {
		int[] subArr = new int[] { 1, 2, 3 };
		int res = 0;
		for (int i = 0; i < subArr.length; i++) {
			int sum = 0;
			for (int j = i; j < subArr.length; j++) {
				sum = sum + subArr[i];
				if (sum == 3) {
					res++;
				}
			}
		}
		System.out.println(res);
	}

	private static void printArr(int[] arr) {
		int index = 0;
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	private static boolean compareArray(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i])
					return false;
			}
			return true;
		}

		return false;
	}

	private static void printUnion(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			set.add(arr2[j]);
		}
		System.out.println(set);
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			if (set.contains(arr2[j])) {
				System.out.println(arr2[j] + " ");
			}
		}
	}

	// find special character from string //Sandip@#$

	private static void printSpecialChar(String str) {
		int count = 0;
		String removedChar = "";
		String specialChar = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				count++;
				specialChar += str.charAt(i);
			} else {
				removedChar += str.charAt(i);
			}
		}
		System.out.println(count + " " + specialChar + " " + removedChar);

	}

	// find rotation of two string ABCD CDAB
	private static boolean rotationOfTwoString(String str1, String str2) {
		return (str1.length() == str2.length() && ((str1 + str1).indexOf(str2) != -1));

	}

}
