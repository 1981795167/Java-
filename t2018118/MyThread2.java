package t2018118;

public class MyThread2 extends Thread{
	@Override
	public void run(){
		try{
			System.out.println("run threadName: " + this.currentThread().getName() + " begin "
					+ System.currentTimeMillis()+ " @@ " + Thread.currentThread().getId());
			//Thread.sleep(2000);
			System.out.println("run threadName: " + this.currentThread().getName() + " end "
					+ System.currentTimeMillis()+ " @@ " + Thread.currentThread().getId());
		    System.out.println(this.currentThread() == Thread.currentThread());
		    System.out.println(this.currentThread() == this);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
