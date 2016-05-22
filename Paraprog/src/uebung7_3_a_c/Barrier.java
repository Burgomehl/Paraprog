package uebung7_3_a_c;

import java.util.List;
import java.util.Vector;

public class Barrier {
	private int process = 3;
	List<Object> l = new Vector<>();
	private boolean isRemoving = false;

	public synchronized void sync() throws InterruptedException {
		++count;
		if (!(count>=process)) {
			wait();
		}
		--count;
		notifyAll();
	}
	
	private int count = 0;
	
	public synchronized void sync(Object p) throws InterruptedException {
		++count;
		while (!(count>=process) && !isRemoving) {
			wait();
		}
		--count;
		isRemoving = true;
		notifyAll();
		if(count<=0){
			isRemoving = false;
		}
		while(isRemoving){
			wait();
		}
		notifyAll();
	}
}
