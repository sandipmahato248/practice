package rec;

public class RecVid {
	
	//downprint
	public static void print(int n) {
		if(n==0) return;
		System.out.print(n);
		print(n-1);
	}
	
	//length of string
	public static int len(String s) {
		if(s == null || s.isEmpty()) return 0;
		return 1+len(s.substring(1));
	}
	
	//print char rev
	public static void charRev(String s) {
		if(s == null || s.isEmpty()) return;
		charRev(s.substring(1));
		System.out.println(s.charAt(0));
	}
	
	//print fact
	public static int fact(int num) {
		if(num ==0 || num ==1) return 1;
		return num * fact(num-1);
		
	}
	
	//reverse num
	public static void reverseNum(int num) {
		if(num>0) {
			System.out.println(num%10);
			reverseNum(num /=10);
		}
	}
	
	//print fibo
	public static int fibo(int num) {
		if(num == 0|| num ==1)return num;
		return fibo(num-1) + fibo(num-2);
		
	}
	
	public static int recSum(int n) {
		if(n==1) return 1;
		else 
			return n+recSum(n-1);
	}
	
	public static int linearSearch(Object[] items, Object target) {
		return linearSearch(items,target,0);
		
	}
	
	private static int linearSearch(Object[] items, Object target, int index) {
		if(index == items.length) return -1;
		else if(target.equals(items[index])) return index;
		else 
			return linearSearch(items, target,index+1);
	}

	public static void main(String[] args) {
		print(5);
		
		System.out.println(len("sandip"));
		charRev("sandip");
		System.out.println(fact(5));
		reverseNum(12345);
		System.out.println(fibo(6));
		System.out.println();
		System.out.println(recSum(5));
		System.out.println();
		Object[] obj = {1,2,4,5,6,7};
		System.out.println(linearSearch(obj, 6));
	}
	

	

}
