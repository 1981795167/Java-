package page76;

public class Task {
	private String getData1;
	private String getData2;
	
	public void doLongTimeTask(){
		System.out.println("begin task");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String privateData1 = "长时间处理任务后从远程返回的值1  threadName= " + Thread.currentThread();
		String privateData2 = "长时间处理任务后从远程返回的值2  threadName= " + Thread.currentThread();
	
	    synchronized(this){
	    	getData1 = privateData1;
	    	getData2 = privateData2;
	    }
	
	    System.out.println(getData1);
	    System.out.println(getData2);
	    System.out.println("end task");
	}
		
}
