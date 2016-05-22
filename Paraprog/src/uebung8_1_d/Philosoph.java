package uebung8_1_d;

public class Philosoph extends Thread{

	protected Gabel ersteGabel;
	protected Gabel zweiteGabel;
	protected String name;
	
	public Philosoph(Gabel ersteGabel,Gabel zweiteGabel, String name) {
		this.ersteGabel = ersteGabel;
		this.zweiteGabel = zweiteGabel;
		this.name = name;
	}

	@Override
	public void run() {
		for(;;){
			try {
				ersteGabel.nehmeGabel(this);
				System.out.println("P["+name+"]"+"Rechte Gabel genommen");
				zweiteGabel.nehmeGabel(this);
				System.out.println("P["+name+"]"+"Linke Gabel genommen");
				System.out.println("P["+name+"]"+"Philosoph isst");
				ersteGabel.legeGabel(this);
				zweiteGabel.legeGabel(this);
				System.out.println("P["+name+"]"+"Gabeln zurückgelegt");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
