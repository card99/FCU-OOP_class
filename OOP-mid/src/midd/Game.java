package midd;

import java.util.*;

public class Game {
	  public static Player fight(Player... players) {
	    Player player1 = players[0];
	    Player player2 = players[1];
	    Player winner;
	    int totalGrade = 0;
	    
	    Random ran = new Random();
	    
	    
	    for (int i = 0; i < 3; i++) {  
	        if (player1.getTypeNames()[i].getType() == player2.getTypeNames()[i].getType()) {  //種類相同
	          totalGrade += ran.nextInt(2);
	        } else if (player1.getTypeNames()[i].getType() == Type.Paper && player2.getTypeNames()[i].getType() == Type.Stone) {
	            totalGrade += 0;
	        } else if(player1.getTypeNames()[i].getType() == Type.Sessor && player2.getTypeNames()[i].getType() == Type.Paper) {
	            totalGrade += 0;
	        } else if(player1.getTypeNames()[i].getType() == Type.Stone && player2.getTypeNames()[i].getType() == Type.Sessor) {
	            totalGrade += 0; 
	        } else {
	            totalGrade +=1;
	        }
	    }
	 
	        
	    if (totalGrade <= 1) {
	      winner = player1;
	    } else {
	      winner = player2;
	    }
	    
	    winner.setLevel(winner.getLevel() +1);

	    System.out.println("Winner" + winner.getPlayerName() + ", and his/her level becomes "+ winner.getLevel());
	    return winner;
    }
}

