package uebung8_4_a;

public interface IBuffer {
	public void put(int i) throws InterruptedException;
	public int take() throws InterruptedException;
	public void clear();
}
