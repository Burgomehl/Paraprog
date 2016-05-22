package uebung8_1_d;

public class StartPhilosoph2 {

	public static void main(String[] args){
		Gabel gabel1 = new Gabel();
		Gabel gabel2 = new Gabel();
		Gabel gabel3 = new Gabel();
		Gabel gabel4 = new Gabel();
		Gabel gabel5 = new Gabel();
		//geändertes Model Philosoph(ersteGabel,zweiteGabel)
		//gerade Philosophen linke Gabel zuerst ungerade die rechte zuerst
		Philosoph p1 = new Philosoph(gabel1, gabel5, "1");
		Philosoph p2 = new Philosoph(gabel1, gabel2, "2");
		Philosoph p3 = new Philosoph(gabel3, gabel2, "3");
		Philosoph p4 = new Philosoph(gabel3, gabel4, "4");
		Philosoph p5 = new Philosoph(gabel5, gabel4, "5");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
	
}
