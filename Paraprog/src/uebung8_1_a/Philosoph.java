package uebung8_1_a;

public class Philosoph extends Thread{

	private Gabel rechts;
	private Gabel links;
	private String name;
	
	public Philosoph(Gabel rechts,Gabel links, String name) {
		this.rechts = rechts;
		this.links = links;
		this.name = name;
	}

	@Override
	public void run() {
		for(;;){
			try {
				rechts.nehmeGabel();
				System.out.println("P["+name+"]"+"Rechte Gabel genommen");
				links.nehmeGabel();
				System.out.println("P["+name+"]"+"Linke Gabel genommen");
				System.out.println("P["+name+"]"+"Philosoph isst");
				rechts.legeGabel();
				links.legeGabel();
				System.out.println("P["+name+"]"+"Gabeln zurückgelegt");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
