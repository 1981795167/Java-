package page99;

public class Service {
	public synchronized  void printA(){
		System.out.println("线程名字： " + Thread.currentThread().getName() + " 在  " + System.currentTimeMillis() 
		   + "进入printA");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("线程名字： " + Thread.currentThread().getName() + " 在  " + System.currentTimeMillis() 
		   + "离开printA");
	}
	
	public synchronized  void printB(){
		System.out.println("线程名字： " + Thread.currentThread().getName() + " 在  " + System.currentTimeMillis() 
		   + "进入printB");
				
		System.out.println("线程名字： " + Thread.currentThread().getName() + " 在  " + System.currentTimeMillis() 
		   + "离开printB");
	}

}
