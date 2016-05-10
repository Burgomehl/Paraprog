package uebung7_1_a;

public class EinzelPufferMonitor {
	private int count = 0;

	public synchronized void rein() throws InterruptedException {
		while((count>0)){
			wait();
		}
		++count;
		System.out.println("rein "+count);
		notifyAll();
	}

	public synchronized void raus() throws InterruptedException {
		while((count==0)){
			wait();
		}
		--count;
		System.out.println("raus "+count);
		notifyAll();
	}
}
