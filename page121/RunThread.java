package page121;

public class RunThread extends Thread{
	private  boolean isRunning = true;
	
	public boolean getisRunning(){
		return this.isRunning;
	}
	
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	public void run(){
		System.out.println("����run����");
		while(isRunning == true){
			
		}
		System.out.println("�뿪run����");
	}

}
