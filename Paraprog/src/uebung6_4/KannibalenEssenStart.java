package uebung6_4;

public class KannibalenEssenStart {
	public static void main(String[] args){
		B�fett b�fett = new B�fett();
		Kannibale k1 = new Kannibale(b�fett);
		Kannibale k2 = new Kannibale(b�fett);
		Kannibale k3 = new Kannibale(b�fett);
		Koch koch = new Koch(b�fett);
		
		k1.start();
		k2.start();
		k3.start();
		koch.start();
	}
}
