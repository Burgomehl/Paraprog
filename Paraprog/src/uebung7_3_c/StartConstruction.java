package uebung7_3_c;

import java.util.concurrent.CyclicBarrier;

public class StartConstruction {
	public static void main(String[] args){
//		Barrier barrier = new Barrier();
		CyclicBarrier barrier = new CyclicBarrier(3);
		Production prodA = new Production(barrier, "A");
		Production prodB = new Production(barrier, "B");
		Production prodC = new Production(barrier, "C");
		prodA.start();
		prodB.start();
		prodC.start();
	}
}
