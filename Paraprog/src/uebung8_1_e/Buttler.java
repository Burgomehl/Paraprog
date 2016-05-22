package uebung8_1_e;

public class Buttler {
	
	private int pl�tze;
	private int besetzt;
	
	public Buttler(int pl�tze) {
		this.pl�tze = pl�tze;
		this.besetzt = 0;
	}
	
	public synchronized void m�chteSitzen() throws InterruptedException{
		while(!(besetzt<pl�tze)){
			wait();
		}
		++besetzt;
		notifyAll();
	}
	
	public synchronized void m�chteAufstehen(){
		--besetzt;
		notifyAll();
	}

}
