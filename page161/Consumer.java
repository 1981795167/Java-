package page161;

public class Consumer {
    private String lock;
	
    public Consumer(String lock) {
		this.lock = lock;
	}
    public void getValue(){
    	synchronized(lock){
    		while("".equals(ValueObject.value)){
    			System.out.println("消费者 " + Thread.currentThread().getName() + "waiting!￥￥￥￥￥￥￥");
    			try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		}
			System.out.println("消费者 " + Thread.currentThread().getName() + "Runable");
            ValueObject.value = "";
            lock.notifyAll();
    	}
    }

}
