
public class HelloClassMain {
	public static void main(String[] args){
		HelloClassAtomic helloClass = new HelloClassAtomic("Big big World");
		HelloLowerThread lower = new HelloLowerThread(helloClass);
		HelloNormalThread normal = new HelloNormalThread(helloClass);
		HelloUpperThread upper = new HelloUpperThread(helloClass);
		normal.start();
		lower.start();
		upper.start();
	}
}
