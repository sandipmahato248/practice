package prac;

import java.util.ArrayList;

public class StackAL {
	ArrayList<Integer> al = new ArrayList<>();

	public void push(int data) {
		al.add(data);
	}

	public int pop() {
		if (al.isEmpty())
			return -1;
		int result = al.get(al.size() - 1);
		al.remove(al.size() - 1);
		return result;
	}

	public int peek() {
		if (al.isEmpty())
			return -1;
		return al.get(al.size() - 1);
	}

}
