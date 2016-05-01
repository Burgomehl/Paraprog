package uebung6_3;

public class W�chter extends Thread {
	private Steuerung steuerung;

	public W�chter(Steuerung steuerung) {
		this.steuerung = steuerung;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1600);
				steuerung.museumsEintritt�ndern();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
