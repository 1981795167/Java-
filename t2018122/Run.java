package t2018122;

public class Run {
	
	public static void main(String []args) throws InterruptedException{
		final MyObject myObject = new MyObject();
		Thread thread1 = new Thread(){
			public void run(){
				myObject.setValue("a", "aa");
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(100);
		
		Thread thread2 = new Thread(){
			public void run(){
				myObject.printUserNamePassword();
			}
		};
		
		thread2.start();
		
		
	
	}

}
