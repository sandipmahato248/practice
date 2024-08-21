package dsa;

public class MyArrayList {
	private String[]  arr;
	private int size;
	private final int IN_SIZE = 4;
	
	public MyArrayList() {
		arr = new String[IN_SIZE];
		size =0;
	}
	
	public void add(String s) {
		if(s == null) return;
		if(size == arr.length) 
			resize();
		arr[size] = s;
		size++;
	}
	
	public void insert(String s, int pos) {
		if(pos>size-1 || pos<0) return;
		if(s == null) return;
		if(pos == arr.length-1 || size+1> arr.length)
			resize();
		
		String[] temp = new String[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(arr, pos, temp, pos+1, arr.length-pos);
//	same as above to copy array	
//		for(int i=0; i< pos;i++) {
//			temp[i] = arr[i];
//		}
//		temp[pos] = s;
//		for(int i=pos+1; i<arr.length;i++) {
//			temp[i] = arr[i-1];
//		}
		
		arr = temp;
		++size;
		
	}
	
	public boolean remove(String s) {
		if(size == 0) return false;
		if(s == null) return false;
		int index=-1;
		for(int i=0;i<size;i++) {
			if(arr[i].equals(s)) {
				index = i;
				break;
			}
		}
		if(index == -1) return false;
		String[] temp = new String[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, index);
		System.arraycopy(arr, index+1, temp, index, arr.length-(index+1));
		arr = temp;
		--size;
		return true;
	}
	
	public boolean search(String val) {
		if(val == null) return false;
		for(String s : arr) {
			if(s.equals(val))
				return true;
		}
		return false;
	}
	
	public String delete(int index) {
		return null;
	}
	
	private void resize() {
		System.out.println("Resizing");
		 int len = arr.length;
		 int newLen = 2* len;
		 String[] temp = new String[newLen];
		 System.arraycopy(arr, 0, temp, 0, len);
		 arr = temp;
	}
	
	
	public String get(int index) {
		if(index<0 || index>size)
			return null;
		return arr[index];
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<size-1;i++) {
			sb.append(arr[i]+",");
		}
		sb.append(arr[size-1]+"]");
		return sb.toString();
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public static void main(String[] args) {
		MyArrayList ml = new MyArrayList();
		ml.add("sandip");
		ml.add("Ramesh");
		ml.add("Mobek");
		ml.add("Bikram");
		ml.add("Sri");
		System.out.println(ml.toString());
		System.out.println(ml.get(0));
	}

}
