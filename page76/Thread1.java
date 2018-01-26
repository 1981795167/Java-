package page76;

public class Thread1 extends Thread {
	private Task task;
	
	public Thread1(Task task){
		super();
		this.task = task;
	}
	public void run(){
		super.run();
		task.doLongTimeTask();
	}

}
