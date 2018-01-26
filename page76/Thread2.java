package page76;

public class Thread2 extends Thread {
	private Task task;
	
	public Thread2(Task task){
		super();
		this.task = task;
	}
	public void run(){
		super.run();
		task.doLongTimeTask();
	}

}
