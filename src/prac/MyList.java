package prac;

public class MyList {
	private String strArray[];
	private int size;
	private final int INITIAL_LEN=4;
	
	public MyList() {
		strArray = new String[INITIAL_LEN];
		size =0;
	}
	
	public void add(String s) {
		if(s == null) return;
		if(strArray.length == size || size+1 > strArray.length)
			resize();
		strArray[size++] = s;
		
	}
	
	public void resize() {
		int len = strArray.length;
		int newLen = 2*len;
		String temp[] = new String[newLen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}
	
	public String get(int index) {
		if(index < 0 || index> size-1) return null;
		return strArray[index];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0; i< size -1;i++) {
			sb.append(strArray[i]+",");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
		
	}
	
	public boolean search(String s) {
		if(s == null) return false;
		for(int i=0;i<size-1;i++) {
			if(strArray[i].equals(s))
				return true;
		}
		
		return false;
	}
	
	public void insert(String s, int pos) {
		if(s == null) return;
		if(pos<0 || pos > size-1) return;
		if(pos == strArray.length-1 || size+1> strArray.length)
			resize();
		
		String temp[] = new String[strArray.length+1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(strArray, pos, temp, pos+1, strArray.length-pos);
		strArray = temp;
		size++;
	}
	
	
	public boolean remove(String s) {
		if(s == null) return false;
		if(size == 0) return false;
		int pos =-1;
		for(int i=0;i< size-1;i++) {
			if(strArray[i].equals(s)) {
				pos = i;
				break;
			}
		}
		if(pos ==-1)
			return false;
		
		String temp[] = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, pos);
		System.arraycopy(strArray, pos+1, temp, pos, strArray.length-pos);
		strArray = temp;
		size--;
		
		return true;
	}

}
