package uebung9_1_b;

public class start {

	public static void main(String[] args) {
		Konto k = new Konto();
		Person p = new Person(k, true);
		Person p1 = new Person(k, false);
		p.start();
		p1.start();
	}

}
