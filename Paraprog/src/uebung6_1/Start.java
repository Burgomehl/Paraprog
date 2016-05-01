package uebung6_1;

public class Start {
	public static void main(String[] args){
		ParkKontrolle pK = new ParkKontrolle();
		Zufahrt z = new Zufahrt(pK);
		Abfahrt a = new Abfahrt(pK);
		z.start();
		a.start();
	}
}
