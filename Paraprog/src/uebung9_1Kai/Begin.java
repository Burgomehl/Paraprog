package uebung9_1Kai;

public class Begin {
	public static void main(String[] args) {
		Girokonto konto = new Girokonto(5,2);
		Person user1 = new Person(konto, "T1",true,false);
		Person user2 = new Person(konto, "T2",false,true);
		Person user3 = new Person(konto, "T3",true,false);
		user1.start();
		user2.start();
		user3.start();
	}
}