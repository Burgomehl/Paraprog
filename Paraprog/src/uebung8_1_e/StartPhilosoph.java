package uebung8_1_e;

public class StartPhilosoph {

	public static void main(String[] args) {
		Gabel gabel1 = new Gabel();
		Gabel gabel2 = new Gabel();
		Gabel gabel3 = new Gabel();
		Gabel gabel4 = new Gabel();
		Gabel gabel5 = new Gabel();
		Buttler b = new Buttler(4);// Plätze
		Philosoph p1 = new Philosoph(gabel1, gabel5, "1", b);
		Philosoph p2 = new Philosoph(gabel2, gabel1, "2", b);
		Philosoph p3 = new Philosoph(gabel3, gabel2, "3", b);
		Philosoph p4 = new Philosoph(gabel4, gabel3, "4", b);
		Philosoph p5 = new Philosoph(gabel5, gabel4, "5", b);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}

}
