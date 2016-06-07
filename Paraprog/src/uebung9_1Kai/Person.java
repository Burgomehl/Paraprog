package uebung9_1Kai;

public class Person extends Thread {
	private Girokonto konto;
	private String name;
	private boolean nurEinzahlen;
	private boolean nurAbheben;

	public Person(Girokonto konto, String name, boolean nurEinzahlen, boolean nurAbheben) {
		this.nurEinzahlen = nurEinzahlen;
		this.nurAbheben = nurAbheben;
		this.konto = konto;
		this.name = name;
	}

	public void willEinzahlen() {
		System.out.print(name);
		try {
			if(konto.willEinzahlen()){
				einzahlen();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void einzahlen() {
		fertigEinzahlen();
	}

	public void fertigEinzahlen() {
		System.out.print(name);
		konto.fertigEinzahlen();
	}

	public void willAbheben() {
		System.out.print(name);
		try {
			if(konto.willAbheben()){
				abheben();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void abheben() {
		fertigAbheben();
	}

	public void fertigAbheben() {
		System.out.print(name);
		konto.fertigAbheben();
	}

	@Override
	public void run() {
		if(nurEinzahlen){
			while(true){
				willEinzahlen();
			}
		}
		
		if(nurAbheben){
			while(true){
				willAbheben();
			}
		}
		
		while (true) {
			Thread.yield();
			if (Math.random() < 0.5) {
				willEinzahlen();
			} else {
				willAbheben();
			}
		}
	}
}
