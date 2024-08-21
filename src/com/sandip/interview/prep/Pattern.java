package com.sandip.interview.prep;

public class Pattern {

	public static void main(String[] args) {

		pattern1();
		System.out.println("-----------------------");
		floydsTriangle();
		System.out.println("-----------------------");
		pyramidPattern();
		
		int n=4;
		int m=5;
	
//		 *****
//		 *****
//		 *****
//		 *****   
		
		for(int i=1; i<=n;i++) {
		 for(int j=1;j<=m;j++) {
			System.out.print("*");
			}
		 System.out.println();
		}
		System.out.println("======\n");
		
//		 *****
//		 *   *
//		 *   *
//		 *****  
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==n || j==m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("======\n");
		
//		 *
//		 **
//		 ***
//		 **** 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======\n");
		
//		 ****
//		  ***
//		   **
//			* 
		
		for(int i=n; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======\n");
		
//		 	 *
//		 	**
//		   ***
//		  **** 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======\n");
		
//		1
//		12
//		123
//		1234
//		12345
		
		for(int i =1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("======\n");
		
//		1234
//		123
//		12
//		1
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("======\n");
		
//		1
//		23
//		456
//		78910
//		1112131415
		
		int number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
		System.out.println("======\n");
		
//		1
//		01
//		101
//		0101
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum = i+j;
				if(sum%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

	

	// *****
	// *****
	// *****
	// *****
	// *****
	private static void pattern1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//1
//2 3
//4 5 6
//7 8 9 10
	private static void floydsTriangle() {
		// i = rows j= columns, n= now of rows & num is for increment the value
		int n= 4;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
	
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
	private static void pyramidPattern() {
		// i = rows j= columns, n= now of rows & num is for increment the value
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

}
