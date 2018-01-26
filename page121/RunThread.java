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
		System.out.println("进入run方法");
		while(isRunning == true){
			
		}
		System.out.println("离开run方法");
	}

}
