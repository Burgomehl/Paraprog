package uebung9_2;

public class Crew {
	private boolean amSchreiben;
	private int leser;

	private synchronized void willLesen() throws InterruptedException {
		while (amSchreiben) {
			wait(100);
		}
		++leser;
	}

	private synchronized void fertigLesen() {
		--leser;
		notifyAll();
	}

	private synchronized void willSchreiben() throws InterruptedException {
		while (leser != 0) {
			wait(100);
		}
		amSchreiben = true;
	}

	private synchronized void fertigSchreiben() {
		amSchreiben = false;
		notifyAll();
	}

	public Object lesen() {
		try {
			willLesen();
			
			fertigLesen();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void schreiben(Object obj) {
		try {
			willSchreiben();

			fertigSchreiben();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
