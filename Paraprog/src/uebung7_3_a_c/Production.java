package uebung7_3_a_c;

public class Production extends Thread{
	
	private Barrier barrier;
	private String name;
	private static int runs = 20;
	
	public Production(Barrier barrier,String name) {
		this.barrier = barrier;
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < runs; i++) {
			try {
				System.out.println("prod"+name);
				System.out.println("fertig"+name);
				barrier.sync(this);
//				sleep(100);
				System.out.println("montage"+name);
				System.out.println("montiert"+name);
				barrier.sync(this);
//				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
