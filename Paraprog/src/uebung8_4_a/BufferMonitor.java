package uebung8_4_a;

import java.util.LinkedList;
import java.util.List;

public class BufferMonitor implements IBuffer{
	private List<Integer> list = new LinkedList<>();
	private int size;
	public BufferMonitor(int size) {
		this.size = size;
	}

	@Override
	public void put(int i) throws InterruptedException{
		while(!(list.size()>size)){
			wait();
		}
		list.add(i);
	}

	@Override
	public int take() throws InterruptedException {
		while(list.size()!=0){
			wait();
		}
		Integer integer = list.get(0);
		list.remove(0);
		return integer;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		//Gibt es nicht
	}

}
