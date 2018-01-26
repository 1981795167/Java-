package t2018122;

public class MyObject {
	private String name = "myname";
	private String password = "mypassword";
	
	public void setValue(String u,String p){
		this.name = u;
		if(Thread.currentThread().getName().equals("a") ){
			System.out.println("a ½ø³ÌÔÝÍ£");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}
	
	public void printUserNamePassword(){
		System.out.println(name + " " + password);
	}

}
