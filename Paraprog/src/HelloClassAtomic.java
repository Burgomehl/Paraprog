
public class HelloClassAtomic extends HelloClass {

	public HelloClassAtomic(String name) {
		super(name);
	}
	
	@Override
	protected synchronized void printIt(String str) {
		super.printIt(str);
	}

}
