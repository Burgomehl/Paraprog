
public class HelloLowerThread extends Thread{
	HelloClass helloClass;
	public HelloLowerThread(HelloClass helloClass) {
		this.helloClass = helloClass;
	}
	@Override
	public void run() {
		helloClass.printLower();
	}

}
