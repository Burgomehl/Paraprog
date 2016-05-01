public class HelloClass {
	private String greeting;

	public HelloClass(String name) {
		this.greeting = ">>> Hello " + name + "! <<<";
	}

	public void printNormal() {
		printIt(greeting);
	}

	public void printLower() {
		printIt(greeting.toLowerCase());
	}

	public void printUpper() {
		printIt(greeting.toUpperCase());
	}

	protected void printIt(String str) {
		for (int i = 0; i < str.length(); i++) {
			try {
				Thread.sleep(Math.round(Math.random()) * 100);
			} catch (Exception e) {
			}
			System.out.print(str.substring(i, i + 1));
		}
		System.out.println();
	}
}
