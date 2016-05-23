package uebung8_4_b;

public class BufferReader extends Thread{
	private int anzahl;
	private IBuffer buffer;
	private long[] zeiten;
	private boolean debug;
	
	public BufferReader(int anzahl, IBuffer buffer, boolean debug) {
		this.anzahl = anzahl;
		this.buffer = buffer;
		zeiten = new long[1];
		this.debug = debug;
	}
	@Override
	public void run() {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < anzahl; i++) {
			try {
				buffer.put(i);
				if(debug){
					System.out.println("Habe die Zahl: "+ i +" rein getan");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		zeiten[0]= System.currentTimeMillis()-time;
		for (long l : zeiten) {
			System.out.println("Zeiten fürs lesen "+l);
		}
	}

}
