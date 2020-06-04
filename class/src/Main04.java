
public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		String x = "Hello";
		String y = new String("Hello");
		
		System.out.println(x);
		System.out.println(y);
		String z = x;
		
		System.out.println(a == b);
		System.out.println(x.equals(y));
		System.out.println(x == y);
		System.out.println(x == z);

	}

}
