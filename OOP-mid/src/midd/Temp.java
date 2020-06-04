package midd;

public class Temp {

	public static double getCtoF(int a) {
		double ans = a * (9 / 5) + 32;
		return ans;
	}
	
	public static double getFtoC(int a) {
		double ans = (a - 32) * 5 / 9;
		return ans;
	}

}

