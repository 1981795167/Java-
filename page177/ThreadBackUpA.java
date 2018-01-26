package page177;

public class ThreadBackUpA extends Thread {
	private DBTools dbtools;
	
	public ThreadBackUpA(DBTools d){
		this.dbtools = d;
	}
	public void run(){
		dbtools.backUpA();
	}

}
