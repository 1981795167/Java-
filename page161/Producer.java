package page161;

public class Producer {
	private String lock;
	
    public Producer(String lock) {
		this.lock = lock;
	}
    
    public void setValue(){
    	synchronized(lock){
    		while(!"".equals( ValueObject.value )){
    			System.out.println("生产者 " + Thread.currentThread().getName() + "waiting!$$$$$$$");
    			try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		}
			System.out.println("生产者 " + Thread.currentThread().getName() + "Runable");
    		String Pvalue = System.currentTimeMillis() + "_" +System.nanoTime();
    		ValueObject.value = Pvalue;
    		lock.notifyAll();
    		
    	}
    }

}
