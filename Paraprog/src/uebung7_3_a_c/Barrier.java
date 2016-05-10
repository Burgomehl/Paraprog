package uebung7_3_a_c;

import java.util.List;
import java.util.Vector;

public class Barrier {
	private int process = 3;
	List<Object> l = new Vector<>();
	private boolean isRemoving = false;

	public synchronized void sync(Object p) throws InterruptedException {
		l.add(p);
		while (l.contains(p) && !(l.size()>=process) && !isRemoving) {
			wait();
		}
		l.remove(p);
		isRemoving = true;
		notifyAll();
		if(l.size()<=0){
			isRemoving = false;
		}
		while(isRemoving){
			wait();
		}
		notifyAll();
	}
}
