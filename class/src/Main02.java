import firstprogram.Psyduck;

public class Main02 {

	public static void main(String[] args) {
		Psyduck duck1 = new Psyduck();
		duck1.name = "FCU Duck";
		duck1.weight = 60.8f;
		duck1.height = 130.5f;
		duck1.hp = 30;

		Psyduck duck2 = new Psyduck();
		duck2.name = "FCU Duck";
		duck2.weight = 60.8f;
		duck2.height = 130.5f;
		duck2.hp = 30;

		System.out.println((duck1 == duck2));
		System.out.println(duck1.equals(duck2));
	}
}