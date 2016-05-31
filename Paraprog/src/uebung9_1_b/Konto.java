package uebung9_1_b;

public class Konto {
	private int kontostand;
	private boolean amAbheben;
	private int einzahler;

	private synchronized void willEinzahlen() throws InterruptedException {
		while (amAbheben) {
			wait();
		}
		++einzahler;
	}

	private synchronized void fertigeinzahlen() {
		--einzahler;
		notifyAll();
	}
	
	private synchronized void willAbheben() throws InterruptedException{
		while(kontostand<=0 && einzahler>0){
			wait();
		}
		amAbheben = true;
	}
	
	private synchronized void fertigAbheben(){
		amAbheben = false;
		notifyAll();
	}
	
	public  void einzahlen(){
		try {
			willEinzahlen();
			++kontostand;
			System.out.println("Es wurde eingezahlt "+kontostand);
			fertigeinzahlen();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public  void abheben(){
		try {
			willAbheben();
			--kontostand;
			System.out.println("es wurde abgehoben "+ kontostand);
			fertigAbheben();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}