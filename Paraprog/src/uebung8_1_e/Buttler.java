package uebung8_1_e;

public class Buttler {
	
	private int plätze;
	private int besetzt;
	
	public Buttler(int plätze) {
		this.plätze = plätze;
		this.besetzt = 0;
	}
	
	public synchronized void möchteSitzen() throws InterruptedException{
		while(!(besetzt<plätze)){
			wait();
		}
		++besetzt;
		notifyAll();
	}
	
	public synchronized void möchteAufstehen(){
		--besetzt;
		notifyAll();
	}

}
