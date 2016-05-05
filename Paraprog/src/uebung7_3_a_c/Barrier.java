package uebung7_3_a_c;

public class Barrier {
	private int process = 3;
	private int count = 0;

	public synchronized void sync() throws InterruptedException {
		if(count == process){
			count = 0;
		}
		while ((++count < process)) {
			wait();
		}
		notifyAll();
	}
}
