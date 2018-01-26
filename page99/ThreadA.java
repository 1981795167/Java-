package page99;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service s){
		super();
		this.service = s;
	}
	public void run(){
		super.run();
		service.printA();
	}

}
