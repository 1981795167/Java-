package page177;

public class ThreadBackUpB extends Thread {
	private DBTools dbtools;
	
	public ThreadBackUpB(DBTools d){
		this.dbtools = d;
	}
	public void run(){
		dbtools.backUpB();
	}

}
