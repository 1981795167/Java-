package page76;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		
		Thread1 thread1 = new Thread1(task);
		thread1.start();
		Thread1 thread2 = new Thread1(task);
		thread2.start();

	}

}
