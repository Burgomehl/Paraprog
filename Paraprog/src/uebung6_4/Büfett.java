package uebung6_4;

public class B�fett {
	private static int b�ffetLimit = 5;
	private int missionare = b�ffetLimit;
	
	public synchronized void essen() throws InterruptedException{
		while(!(missionare>0)){
			wait();
		}
		missionare--;
		System.out.println("Missionar wurde durch Kanibale gegessen, Kannibale ist gl�cklich. "+missionare+" Missionare �brig.");
		notifyAll();
	}
	
	public synchronized void nachf�llen() throws InterruptedException{
		while((missionare>0)){
			wait();
		}
		missionare += 5;
		System.out.println("Der Koch hat den Missionarsvorrat aufgef�llt");
		notifyAll();
	}
	

}
