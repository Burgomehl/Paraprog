package uebung9_1Kai;

public class Girokonto {
	private int stand;
	private boolean amAbheben;
	private int einzahler;
	private final int NPersonen;
	private final int upperLimit = 1000000;
	private final int lowerLimit = 0;
	
	public int getStand(){
		return stand;
	}
	
	public Girokonto(int kontostand, int npersonen){
		this.stand = kontostand;
		this.NPersonen = npersonen;
	}
	
	public synchronized boolean willEinzahlen() throws InterruptedException{
		if(stand >= upperLimit){
			System.out.println("Konto voll");
			return false;
		}
		if(stand < upperLimit && !amAbheben && einzahler <= NPersonen){
			stand += 1;
			einzahler += 1;
			System.out.println("willEinzahlen Stand = " + stand);
			return true;
		}
		else{
			System.out.println("willEinzahlen fehlgeschlagen.");
			wait();
			return false;
		}
	}
	
	public synchronized boolean fertigEinzahlen(){
		if(einzahler > 0){
			einzahler -= 1;
			System.out.println("fertigEinzahlen");
			notifyAll();
			return true;
		}
		else{
			System.out.println("fertigEinzahlen fehlgeschlagen");
			notifyAll();
			return false;
		}
	}
	
	public synchronized boolean willAbheben() throws InterruptedException{
		if(stand <= lowerLimit){
			System.out.println("Konto leer");
			return false;
		}
		if(stand > lowerLimit && !amAbheben && einzahler == 0){
			stand -= 1;
			amAbheben = true;
			System.out.println("willAbheben Stand = " + stand);
			return true;
		}
		else{
			System.out.println("willAbheben fehlgeschlagen");
			wait();
			return false;
		}
	}
	
	public synchronized void fertigAbheben(){
		System.out.println("fertigAbheben");
		amAbheben = false;
		notifyAll();
	}
}
