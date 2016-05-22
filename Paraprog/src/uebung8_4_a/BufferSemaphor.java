package uebung8_4_a;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class BufferSemaphor implements IBuffer{
	private List<Integer> list = new LinkedList<>();
	private Semaphore sem;
	private Semaphore sem2;
	
	public BufferSemaphor(int size) {
		sem = new Semaphore(size);
		sem2 = new Semaphore(size);
	}
	
	@Override
	public void put(int i) throws InterruptedException {
		sem.acquire();
		sem2.release();
		list.add(i);
	}

	@Override
	public int take() throws InterruptedException{
		sem2.acquire();
		sem.release();
		Integer integer = list.get(0);
		list.remove(0);
		return integer;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		//gibt es nicht
	}

}
