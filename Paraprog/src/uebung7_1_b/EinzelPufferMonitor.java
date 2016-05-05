package uebung7_1_b;

import java.util.concurrent.Semaphore;

public class EinzelPufferMonitor {
	private int count = 0;
	private Semaphore semaphore = new Semaphore(1);

	public void rein() throws InterruptedException {
		semaphore.acquire();
		++count;
		System.out.println("rein "+count);
		semaphore.release();
	}

	public void raus() throws InterruptedException {
		boolean leer = true;
		while(leer){
			semaphore.acquire();
			if(count==0){
				semaphore.release();
			}else{
				leer = false;
			}
		}
		--count;
		System.out.println("raus "+count);
		semaphore.release();
	}
}
