package uebung8_1_e;

public class Gabel {
	private boolean gabelLiegt = true;
	
	public synchronized void nehmeGabel() throws InterruptedException{
		while(!gabelLiegt){
			wait();
		}
		gabelLiegt = false;
	}
	
	public synchronized void legeGabel(){
		gabelLiegt = true;
		notifyAll();
	}

}
