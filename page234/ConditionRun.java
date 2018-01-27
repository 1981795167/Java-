package page234;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionRun {
	volatile private static int nextPrintNo = 1;
	private static ReentrantLock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();
	//private static Condition conditionB = lock.newCondition();
	//private static Condition conditionC = lock.newCondition();
	public static void main(String []args){
		Thread threadA = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					lock.lock();
					while(nextPrintNo != 1){
					condition.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("ThreadA " + (i + 1));
					}
					nextPrintNo = 2;
					condition.signalAll();

				} catch(Exception e){
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
				
			}
			
		});
		
		Thread threadB = new Thread(){

			@Override
			public void run() {
				try {
					lock.lock();
					while(nextPrintNo != 2){
					condition.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("ThreadB " + (i + 1));
					}
					nextPrintNo = 3;
					condition.signalAll();

				} catch(Exception e){
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
				
			}
			
		};
		
		Thread threadC = new Thread(){

			@Override
			public void run() {
				try {
					lock.lock();
					while(nextPrintNo != 3){
					condition.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("ThreadC " + (i + 1));
					}
					nextPrintNo = 1;
					condition.signalAll();

				} catch(Exception e){
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
				
			}
			
		};
		
		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		
		for(int i = 0; i < 5; i++){
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
		
	}

}
