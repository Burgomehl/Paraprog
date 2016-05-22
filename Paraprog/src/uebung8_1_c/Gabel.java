package uebung8_1_c;

public class Gabel {
	private boolean gabelLiegt = true;
	
	public synchronized boolean nehmeGabel() throws InterruptedException{
		int timeout = 100;
		while(!gabelLiegt){
			wait(timeout);
			if(!gabelLiegt){
				return false;
			}
		}
		gabelLiegt = false;
		return true;
	}
	
	public synchronized void legeGabel(){
		gabelLiegt = true;
		notifyAll();
	}

}
