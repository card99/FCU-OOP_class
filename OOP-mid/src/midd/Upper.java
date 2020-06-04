package midd;

import java.util.Scanner;

public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("piease enter a sentence : ");
		Scanner keyin = new Scanner(System.in);
		while(true) {
      String word = keyin.next();
      if (word.equals("exit")) {
      	break;
      }
      System.out.print(word.toUpperCase());
		}
		keyin.close();
	}

}
