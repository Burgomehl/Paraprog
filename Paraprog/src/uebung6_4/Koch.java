package uebung6_4;

public class Koch extends Thread{
	B�fett b�fett;
	
	public Koch(B�fett b�fett) {
		this.b�fett = b�fett;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				b�fett.nachf�llen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
