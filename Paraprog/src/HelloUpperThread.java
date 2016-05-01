
public class HelloUpperThread extends Thread{
	HelloClass helloClass;
	
	public HelloUpperThread(HelloClass helloClass) {
		this.helloClass = helloClass;
	}
	@Override
	public void run() {
		helloClass.printUpper();
	}

}
