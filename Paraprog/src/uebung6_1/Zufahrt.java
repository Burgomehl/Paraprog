package uebung6_1;

class Zufahrt extends Thread {
	private ParkKontrolle parkKontrolle;
	private int n = 25; // Anzahl der Einfahrten

	public Zufahrt(ParkKontrolle parkKontrolle) {
		this.parkKontrolle = parkKontrolle;
	}
	
	public void run() {
//		for (int i = 0; i < n; i++) {
//			// i-tes Auto parken
//			boolean geparkt = false;
//			// solange versuchen, bis es geklappt hat
//			while (!geparkt) {
//				geparkt = parkKontrolle.erfolgreichGeparkt();
//			}
//		}
		for (int i 	= 0; i < n ; i++) {
			try {
				sleep((long)(Math.random()*100));
				parkKontrolle.parken();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
