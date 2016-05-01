package uebung6_1;

class ParkKontrolle {
	private int freiePlaetze = 5;

	public ParkKontrolle() {
	}

	public synchronized void parken() throws InterruptedException {
		while (!(freiePlaetze > 0)) {
			wait();
		}
		System.out.println("Parken erfolgreich");
		freiePlaetze--;
		notifyAll();
	}

	public synchronized void wegfahren() throws InterruptedException {
		while (!(freiePlaetze < 5)) {
			wait();
		}
		System.out.println("Abfahrt erfolgreich");
		freiePlaetze++;
		notifyAll(); //nur Notify ja
	}

	public synchronized boolean erfolgreichGeparkt() {
		if (freiePlaetze == 0) {
			System.out.println("Parkplatz ist voll");
			return false; // Parkplatz ist voll
		} else {
			freiePlaetze--;
			System.out.println("Erfolrgreich eingeparkt");
			return true; // Parken war moeglich
		}
	}
}
