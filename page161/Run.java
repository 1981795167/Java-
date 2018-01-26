package page161;

public class Run {

	public static void main(String[] args) {
		String lock = "";
		Producer p = new Producer(lock);
		Consumer c = new Consumer(lock);
		
		ThreadP []threadp = new ThreadP[2]; 
		ThreadC []threadc = new ThreadC[2];
		
		for(int i = 0; i < 2; i++){
			threadp[i] = new ThreadP(p);
			threadp[i].setName( (i+1) + " ");
			
			threadc[i] = new ThreadC(c);
			threadc[i].setName( (i+1) + " ");

			threadp[i].start();
			threadc[i].start();
		}

	}

}
