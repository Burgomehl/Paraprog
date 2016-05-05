package uebung7_1_b;

public class Konsument extends Thread {

	EinzelPufferMonitor einzelPufferMonitor;

	public Konsument(EinzelPufferMonitor einzelPufferMonitor) {
		this.einzelPufferMonitor = einzelPufferMonitor;
	}

	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				sleep(100);
				einzelPufferMonitor.raus();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
