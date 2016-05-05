package uebung7_3_a_c;

public class StartConstruction {
	public static void main(String[] args){
		Barrier barrier = new Barrier();
		Production prodA = new Production(barrier, "A");
		Production prodB = new Production(barrier, "B");
		Production prodC = new Production(barrier, "C");
		prodA.start();
		prodB.start();
		prodC.start();
	}
}
