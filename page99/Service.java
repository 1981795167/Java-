package page99;

public class Service {
	public synchronized  void printA(){
		System.out.println("�߳����֣� " + Thread.currentThread().getName() + " ��  " + System.currentTimeMillis() 
		   + "����printA");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�߳����֣� " + Thread.currentThread().getName() + " ��  " + System.currentTimeMillis() 
		   + "�뿪printA");
	}
	
	public synchronized  void printB(){
		System.out.println("�߳����֣� " + Thread.currentThread().getName() + " ��  " + System.currentTimeMillis() 
		   + "����printB");
				
		System.out.println("�߳����֣� " + Thread.currentThread().getName() + " ��  " + System.currentTimeMillis() 
		   + "�뿪printB");
	}

}
