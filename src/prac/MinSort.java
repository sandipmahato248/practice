package prac;

public class MinSort {
	
	int [] arr;
	public void sort() {
		if(arr == null || arr.length <=1 ) return;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			int nextMinPos = minPos(i,len-1);
			swap(i,nextMinPos);
		}
	}

	private void swap(int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
		arr[j] = temp;
	}

	private int minPos(int i,int j) {
		int pos = i;
		int min = arr[i];
		for(int k=i+1; k<=j;k++) {
			if(arr[k] < min) {
				pos = k;
				min = arr[k];
			}
				
		}
		return pos;
	}
}
