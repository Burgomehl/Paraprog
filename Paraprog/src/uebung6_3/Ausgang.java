package uebung6_3;

public class Ausgang extends Thread {
	private Steuerung steuerung;

	public Ausgang(Steuerung steuerung) {
		this.steuerung = steuerung;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				sleep((long) (Math.random() * 800));
				steuerung.rausgehen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
