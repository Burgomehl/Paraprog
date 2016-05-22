package uebung8_1_d;

public class Gabel {
	private boolean gabelLiegt = true;
	private Object obj;

	public synchronized void nehmeGabel(Object obj) throws InterruptedException {
		while (!gabelLiegt) {
			wait();
		}
		this.obj = obj;
		gabelLiegt = false;
	}

	public synchronized void legeGabel(Object obj) throws Exception {
		if (this.obj.equals(obj)) {
			gabelLiegt = true;
			notifyAll();
		}else{
			throw new Exception("Du darfst mich nicht weglegen ich gehöre einem anderen Philosophen");
		}
	}

}
