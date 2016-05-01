package uebung6_3;

public class Wächter extends Thread {
	private Steuerung steuerung;

	public Wächter(Steuerung steuerung) {
		this.steuerung = steuerung;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1600);
				steuerung.museumsEintrittÄndern();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
