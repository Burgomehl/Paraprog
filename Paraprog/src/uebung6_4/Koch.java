package uebung6_4;

public class Koch extends Thread{
	Büfett büfett;
	
	public Koch(Büfett büfett) {
		this.büfett = büfett;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				büfett.nachfüllen();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
