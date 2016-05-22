package uebung8_1_d;

import java.lang.management.GarbageCollectorMXBean;

public class StartPhilosoph {

	public static void main(String[] args){
		Gabel gabel1 = new Gabel();
		Gabel gabel2 = new Gabel();
		Gabel gabel3 = new Gabel();
		Gabel gabel4 = new Gabel();
		Gabel gabel5 = new Gabel();
		//geändertes Model Philosoph(ersteGabel,zweiteGabel)
		Philosoph p1 = new Philosoph(gabel1, gabel5, "1");
		Philosoph p2 = new Philosoph(gabel1, gabel2, "2");
		Philosoph p3 = new Philosoph(gabel2, gabel3, "3");
		Philosoph p4 = new Philosoph(gabel3, gabel4, "4");
		Philosoph p5 = new Philosoph(gabel4, gabel5, "5");
		CrasherPhilosoph pc = new CrasherPhilosoph(gabel1, gabel3, "Crasher");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		pc.start();
	}
	
}
