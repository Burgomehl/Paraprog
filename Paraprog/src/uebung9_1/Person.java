package uebung9_1;

public class Person extends Thread {
	private Konto konto;
	private boolean ezaz;
	
	public Person(Konto konto,boolean ezaz) {
		this.konto = konto;
		this.ezaz = ezaz;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(ezaz){
				konto.einzahlen();
			}else{
				konto.abheben();
			}
		}
	}
}
