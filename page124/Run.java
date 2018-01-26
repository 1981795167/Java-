package page124;

public class Run {

	public static void main(String[] args) {
		MyThread []MyThreadArray = new MyThread[100];
		for(int i = 0; i < 100; i++){
			MyThreadArray[i] =  new MyThread();
            MyThreadArray[i].start();
		}
		

	}

}
