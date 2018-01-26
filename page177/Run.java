package page177;

public class Run {

	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for(int i = 0; i < 20; i++){
			ThreadBackUpA ta = new ThreadBackUpA(dbtools);
			ThreadBackUpB tb = new ThreadBackUpB(dbtools);
			
			ta.start();
			tb.start();
		}
	}

}
