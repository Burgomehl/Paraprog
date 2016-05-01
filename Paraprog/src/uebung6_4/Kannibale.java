package uebung6_4;

public class Kannibale extends Thread{
	
	B�fett b�fett;
	
	public Kannibale(B�fett b�fett) {
		this.b�fett = b�fett;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				sleep((long)(Math.random()*500));
				b�fett.essen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
