package page124;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
	 private static int count;
	synchronized public static void addCount(){
		for(int i = 0; i < 100; i++){
			count++;
		}
		System.out.println("count= " + count);
	}

	public void run(){
		addCount();
	}
	
	private AtomicInteger count22 = new AtomicInteger();
	
}
