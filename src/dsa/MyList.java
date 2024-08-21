package dsa;

public class MyList {
	
	private String strArray[];
	private int size;
	private final int IN_SIZE = 4;
	
	public MyList() {
		strArray = new String[IN_SIZE];
		size =0;
	}
	
	
	public void add(String s) {
		if(s == null) return;
		if(size == strArray.length)
			resize();
		strArray[size++] = s;
	}
	
	public void remove() {
		
	}
	
	public boolean find(String val) {
		if(strArray.length == 0) return false;
		for(int i=0;i<size;i++) {
			if(strArray[i].equals(val))
				return true;
		}
		return false;
	}
	
	public String get(int index) {
		if(index <0 || index >size-1) return null;
		return strArray[index];
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		int len = strArray.length;
		int newLen = 2 * len;
		String temp[] = new String[newLen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<size-1;i++) {
			sb.append(strArray[i]+",");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
		
	}
	
	public void insert(String s, int pos) {
		if(pos<0 || pos > size-1) return;
		if(s == null) return;
		if(pos == strArray.length -1 || size+1 > strArray.length)
			resize();
		
		String temp[] = new String[strArray.length+1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(strArray, pos, temp, pos+1, strArray.length-pos);
		strArray = temp;
		size++;
	}
	
	public boolean remove(String s) {
		if(size == 0) return false;
		if(s == null) return false;
		int index =-1;
		for(int i=0; i<size-1;i++) {
			if(strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if(index == -1) return false;
		String temp[] = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index+1, temp, index, strArray.length-index);
		strArray = temp;
		size--;
		return true;
		
	}
	
	

}
