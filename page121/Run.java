package page121;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		RunThread thread = new RunThread();
		thread.start();
		thread.sleep(1000);
		thread.setIsRunning(false);
		System.out.println("已经赋值为false");

	}

}
