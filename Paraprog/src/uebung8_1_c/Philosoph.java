package uebung8_1_c;

public class Philosoph extends Thread {

	private Gabel rechteGabel;
	private Gabel linkeGabel;
	private String name;

	public Philosoph(Gabel rechts, Gabel links, String name) {
		this.rechteGabel = rechts;
		this.linkeGabel = links;
		this.name = name;
	}

	@Override
	public void run() {
		for (;;) {
			try {
				if (rechteGabel.nehmeGabel()) {
					System.out.println("P[" + name + "]" + "Rechte Gabel genommen");
					if (linkeGabel.nehmeGabel()) {
						System.out.println("P[" + name + "]" + "Linke Gabel genommen");
						System.out.println("P[" + name + "]" + "Philosoph isst");
						rechteGabel.legeGabel();
						linkeGabel.legeGabel();
						System.out.println("P[" + name + "]" + "Gabeln zurückgelegt");
					} else {
						rechteGabel.legeGabel();
						System.out.println("[[[P[" + name + "]" + "Rechte gabel zurückgelegt]]]");
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
