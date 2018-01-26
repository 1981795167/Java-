package page177;

public class DBTools {
	 private boolean preIsA = true;
	
	synchronized public void backUpA(){
		while(!preIsA){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 5; i++){
			System.out.println("£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤£¤");

		}
		preIsA = false;
		notifyAll();
	}
	
	synchronized public void backUpB(){
		while(preIsA){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 5; i++){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		}
		preIsA = true;
		notifyAll();
	}

}
