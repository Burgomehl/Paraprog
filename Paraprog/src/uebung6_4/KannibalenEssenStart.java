package uebung6_4;

public class KannibalenEssenStart {
	public static void main(String[] args){
		Büfett büfett = new Büfett();
		Kannibale k1 = new Kannibale(büfett);
		Kannibale k2 = new Kannibale(büfett);
		Kannibale k3 = new Kannibale(büfett);
		Koch koch = new Koch(büfett);
		
		k1.start();
		k2.start();
		k3.start();
		koch.start();
	}
}
