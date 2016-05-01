package uebung6_3;

public class Steuerung {
	private static int limit = 20;
	private int maxBesucher = limit;
	private boolean eintrittEnde = true;
	
	public synchronized void besuchen() throws InterruptedException{
		while( eintrittEnde || !(maxBesucher>0)){
			wait();
		}
		maxBesucher--;
		System.out.println("Neuer Besucher noch "+ maxBesucher +" Plätze frei.");
		notifyAll();
	}
	
	public synchronized void rausgehen() throws InterruptedException{
		while(!(maxBesucher<limit)){
			wait();
		}
		maxBesucher++;
		System.out.println("Besucher ist gegangen. "+ maxBesucher +" Plätze sind noch frei.");
		notifyAll();
	}
	
	public synchronized void museumsEintrittÄndern(){
		eintrittEnde = eintrittEnde?false:true;
		System.out.println((eintrittEnde?"Es ist Nacht das Museum wird jetzt geschlossen":"Es ist Tag der Wächter öffnet die Pforten"));
		notifyAll();
	}
	

}
