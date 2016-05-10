package uebung7_3_a_c;

import java.util.ArrayList;
import java.util.List;

public class Barrier {
	private int process = 3;
	private int count = 0;
	List<Production> l = new ArrayList<>();

	public synchronized void sync(Production p) throws InterruptedException {
		
		if(count == process){
			count = 0;
		}
		++count;
		l.add(p);
		while (!(count >= process)&& l.contains(p)) {
			wait();
		}
		l = new ArrayList<>();
		notifyAll();
	}
}
