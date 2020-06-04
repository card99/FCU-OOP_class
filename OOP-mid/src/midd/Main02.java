package midd;

import java.util.*;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------猜拳遊戲--------");
		System.out.println("請選擇(1.石頭)(2.剪刀)(3.布)");
		int computer=(int)(Math.random()*3)+1;
		
		Scanner num=new Scanner(System.in);
		
		int person=num.nextInt();
		
		if (person<=0||person>=4) {
		  System.out.println("你麻痺,要玩就玩,不玩滾!!!");
		} else {
//		  String marks="猜拳";//定義marks,用來說人出的是什麼
//		  String mark="猜拳";//定義marks,用來說機出的是什麼
		//int computersum =(int) (Math.random()*3+1);
		
		if(computer == 1) {
			
		}
//		  switch (person) {
//		    case 1:
//		      marks="石頭";
//		      break;
//		    case 2:
//		      marks="剪刀";
//		      break;
//		    case 3:
//		      marks="布";
//		      break;
//		  }
//		  switch (computer) {
//		    case 1:
//		      mark="石頭";
//		      break;
//		    case 2:
//		      mark="剪刀";
//		      break;
//		    case 3:
//	      	mark="布";
//		      break;
//		  }
//		  
//		  if (person==computer) {
//		    System.out.println("平局!你出的是"+marks+"電腦出的是"+mark);
//		  } else{
//		    if (computer==1 && computer==2 || person==2 && computer==3 || person==3 && computer==1) {
//		    System.out.println("你贏了!你出的是"+marks+"電腦出的是"+mark);
//		    } else {
//		    System.out.println("你輸了!你出的是"+marks+"電腦出的是"+mark);
//		    }
//		  }
		}
	}
}

