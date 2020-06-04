package midd;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a int :¡@");
		Scanner keyin = new Scanner(System.in);
		int[] data = new int[1];
		for(int i = 0; i < 1; i++) {
			data[i] = keyin.nextInt();
		}
		double ans = Temp.getCtoF(data[0]);
		System.out.println(ans);
    keyin.close();
		

	}

}
