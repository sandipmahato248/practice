package prac;

import java.util.Arrays;
import java.util.List;

public class Deadlock {
	public static void main(String[] args) {
		String name= "sandip";
		String caste = "mahato";
		Thread1 t1 = new Thread1(name, caste);
		t1.start();
		
		Thread2 t2 = new Thread2(name,caste);
		t2.start();
		
	}

}
class Thread1 extends Thread {
	private String name;
	private String caste;
	public Thread1(String name, String caste) {
		super();
		this.name = name;
		this.caste = caste;
	}
	
	@Override
	public void run() {
	}
	
}
class Thread2 extends Thread{
	private String name;
	private String caste;
	public Thread2(String name, String caste) {
		super();
		this.name = name;
		this.caste = caste;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
