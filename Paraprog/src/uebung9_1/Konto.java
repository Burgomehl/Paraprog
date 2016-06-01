package uebung9_1;

public class Konto {
	private int kontostand;
	private boolean amAbheben;
	private int einzahler;

	private  void willEinzahlen() throws InterruptedException {
		while (amAbheben) {
			wait();
		}
		++einzahler;
	}

	private  void fertigeinzahlen() {
		--einzahler;
		notifyAll();
	}
	
	private  void willAbheben() throws InterruptedException{
		while(kontostand<=0 && einzahler>0){
			wait();
		}
		amAbheben = true;
	}
	
	private  void fertigAbheben(){
		amAbheben = false;
		notifyAll();
	}
	
	public synchronized void einzahlen(){
		try {
			willEinzahlen();
			++kontostand;
			System.out.println("Es wurde eingezahlt "+kontostand);
			fertigeinzahlen();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void abheben(){
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