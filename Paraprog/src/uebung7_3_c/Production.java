package uebung7_3_c;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Production extends Thread{
	
	private CyclicBarrier barrier;
	private String name;
	private static int runs = 20;
	
	public Production(CyclicBarrier barrier,String name) {
		this.barrier = barrier;
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < runs; i++) {
			try {
				System.out.println("prod"+name);
				System.out.println("fertig"+name);
				barrier.await();
				sleep(100);
				System.out.println("montage"+name);
				System.out.println("montiert"+name);
				barrier.await();
				sleep(100);
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			
		}
	}
}
