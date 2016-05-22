package uebung8_1_e;

public class Philosoph extends Thread{

	private Gabel rechts;
	private Gabel links;
	private String name;
	private Buttler buttler;
	
	public Philosoph(Gabel rechts,Gabel links, String name, Buttler buttler) {
		this.rechts = rechts;
		this.links = links;
		this.name = name;
		this.buttler = buttler;
	}

	@Override
	public void run() {
		for(;;){
			try {
				buttler.möchteSitzen();
				System.out.println("P["+name+"]"+" hat Platz gefunden");
				rechts.nehmeGabel();
				System.out.println("P["+name+"]"+"Rechte Gabel genommen");
				links.nehmeGabel();
				System.out.println("P["+name+"]"+"Linke Gabel genommen");
				System.out.println("P["+name+"]"+"Philosoph isst");
				rechts.legeGabel();
				links.legeGabel();
				System.out.println("P["+name+"]"+"Gabeln zurückgelegt");
				buttler.möchteAufstehen();
				System.out.println("P["+name+"]"+" hat Platz frei gegeben");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
