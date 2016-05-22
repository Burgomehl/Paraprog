package uebung8_4_a;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class BufferSpinLock implements IBuffer{
	ReentrantLock lock;
	private List<Integer> list = new LinkedList<>();
	private int size;
	
	public BufferSpinLock(int size) {
		// TODO Auto-generated constructor stub
		lock = new ReentrantLock();
		this.size = size;
	}
	
	@Override
	public void put(int i) {
		// TODO Auto-generated method stub
		if(lock.tryLock()){
			
			lock.unlock();
		}
	}

	@Override
	public int take() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

}
