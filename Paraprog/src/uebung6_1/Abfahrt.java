package uebung6_1;

public class Abfahrt extends Thread{
	private ParkKontrolle parkKontrolle;
	private int n = 25; // Anzahl der Ausfahrten Deadlook, wenn keine Plätze mehr da sind autos noch rein wollen aber keine weg fahren
	
	public Abfahrt(ParkKontrolle parkKontrolle) {
		this.parkKontrolle = parkKontrolle;
	}
	
	@Override
	public void run() {
		for (int i 	= 0; i < n ; i++) {
			try {
				sleep((long)(Math.random()*100));
				parkKontrolle.wegfahren();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
