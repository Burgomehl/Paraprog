package uebung8_1_b;

public class Philosoph extends Thread{

	private Gabel ersteGabel;
	private Gabel zweiteGabel;
	private String name;
	
	public Philosoph(Gabel ersteGabel,Gabel zweiteGabel, String name) {
		this.ersteGabel = ersteGabel;
		this.zweiteGabel = zweiteGabel;
		this.name = name;
	}

	@Override
	public void run() {
		for(;;){
			try {
				ersteGabel.nehmeGabel();
				System.out.println("P["+name+"]"+"Rechte Gabel genommen");
				zweiteGabel.nehmeGabel();
				System.out.println("P["+name+"]"+"Linke Gabel genommen");
				System.out.println("P["+name+"]"+"Philosoph isst");
				ersteGabel.legeGabel();
				zweiteGabel.legeGabel();
				System.out.println("P["+name+"]"+"Gabeln zurückgelegt");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
