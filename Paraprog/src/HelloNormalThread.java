
public class HelloNormalThread extends Thread{
	HelloClass helloClass;
	public HelloNormalThread(HelloClass helloClass) {
		this.helloClass = helloClass;
	}
	@Override
	public void run() {
		helloClass.printNormal();
	}
	
}
