package page99;

public class ThreadB extends Thread {
	private Service service;
	
	public ThreadB(Service s){
		super();
		this.service = s;
	}
	public void run(){
		super.run();
		service.printB();
	}

}
