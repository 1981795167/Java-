package page99;

public class Run {

	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		
		ThreadA a = new ThreadA(service1);
		ThreadB b = new ThreadB(service1);
		
		a.start();
		b.start(); 

	}

}
