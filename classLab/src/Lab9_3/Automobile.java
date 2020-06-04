package Lab9_3;

public class Automobile extends Vechicle {
	public static void main(String[] args) {
		Automobile auto = new Automobile("123","123");  //­×§ï­È
		System.out.println("Mark: " + auto.getMark());
		
	}

	public Automobile(String mark, String model) {
		super(mark, model);
		// TODO Auto-generated constructor stub
	}

}
