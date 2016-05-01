package uebung6_3;

public class Eingang extends Thread {
	private Steuerung steuerung;

	public Eingang(Steuerung steuerung) {
		this.steuerung = steuerung;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				sleep((long) (Math.random() * 200));
				steuerung.besuchen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
