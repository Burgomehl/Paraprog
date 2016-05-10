package uebung7_1_a;

public class Produzent extends Thread {

	EinzelPufferMonitor einzelPufferMonitor;

	public Produzent(EinzelPufferMonitor einzelPufferMonitor) {
		this.einzelPufferMonitor = einzelPufferMonitor;
	}

	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
//				sleep(100);
				einzelPufferMonitor.rein();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
