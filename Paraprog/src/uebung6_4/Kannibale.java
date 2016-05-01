package uebung6_4;

public class Kannibale extends Thread{
	
	Büfett büfett;
	
	public Kannibale(Büfett büfett) {
		this.büfett = büfett;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				sleep((long)(Math.random()*500));
				büfett.essen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
