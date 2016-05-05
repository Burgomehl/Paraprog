package uebung7_1_a;

public class StartPuffer {
	
	public static void main(String[] args){
		EinzelPufferMonitor einzelPufferMonitor = new EinzelPufferMonitor();
		Produzent p = new Produzent(einzelPufferMonitor);
		Konsument k = new Konsument(einzelPufferMonitor);
		p.start();
		k.start();
	}
	
}
