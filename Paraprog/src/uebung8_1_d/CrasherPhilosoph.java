package uebung8_1_d;

public class CrasherPhilosoph extends Philosoph{

	public CrasherPhilosoph(Gabel ersteGabel, Gabel zweiteGabel, String name) {
		super(ersteGabel, zweiteGabel, name);
	}
	
	@Override
	public void run() {
		for(;;){
				try {
					ersteGabel.legeGabel(this);
					zweiteGabel.legeGabel(this);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}

}
