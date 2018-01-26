package t2018118;

public class Run2 {
	public static void main(String []args) throws InterruptedException{
		MyThread2 myThread = new MyThread2();
		System.out.println("run threadName: " + Thread.currentThread().getName() + " begin "
				+ System.currentTimeMillis()+ " @@ " + Thread.currentThread().getId());
		myThread.start();
		Thread.sleep(2000);
		System.out.println("run threadName: " + Thread.currentThread().getName() + " end "
				+ System.currentTimeMillis() + " @@ " + Thread.currentThread().getId());
		myThread.interrupted();
	}

}
