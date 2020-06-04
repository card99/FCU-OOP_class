package midd;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.dom.KeyIndex;

public class Main04 {

	public enum Type {
	  Paper, Sessor, Stone
	}
	
	private Type type= Type.Paper;
	
	public Type getType() {
		return type;
	}
	public void  SetType(Type newtype) {
		Type c = newtype;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int) (Math.random()*3)+1;
		if (random ==1) {
			Type cType = Type.Paper;
		}else if(random ==2) {
			Type cType = Type.Sessor;
		}else {
			Type cType = Type.Stone;
		}
		Scanner ketin =  new Scanner(System.in);
		System.out.print("enter your num");
		int person = keyin.nextInt();
		switch (person) {
//  case 1:
//    marks="•€¿Y";
//    break;
//  case 2:
//    marks="∞≈§M";
//    break;
//  case 3:
//    marks="•¨";
//    break;
//}
		
	}

}
