package uebung6_3;

public class MuseumStart {
	public static void main(String[] args){
		Steuerung st = new Steuerung();
		Eingang e = new Eingang(st);
		Ausgang a = new Ausgang(st);
		W�chter w = new W�chter(st);
		
		e.start();
		a.start();
		w.start();
	}
	
}
