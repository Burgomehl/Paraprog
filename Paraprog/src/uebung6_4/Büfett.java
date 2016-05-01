package uebung6_4;

public class Büfett {
	private static int büffetLimit = 5;
	private int missionare = büffetLimit;
	
	public synchronized void essen() throws InterruptedException{
		while(!(missionare>0)){
			wait();
		}
		missionare--;
		System.out.println("Missionar wurde durch Kanibale gegessen, Kannibale ist glücklich. "+missionare+" Missionare übrig.");
		notifyAll();
	}
	
	public synchronized void nachfüllen() throws InterruptedException{
		while((missionare>0)){
			wait();
		}
		missionare += 5;
		System.out.println("Der Koch hat den Missionarsvorrat aufgefüllt");
		notifyAll();
	}
	

}
