package midd;

import java.util.Random;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Player player1 = new Player("Player One");

	    TypeName pkm11 = new TypeName("Paper", Type.Paper);
	    TypeName pkm12 = new TypeName("Sessor", Type.Sessor);
	    TypeName pkm13 = new TypeName("Stone", Type.Stone);
	    TypeName[] pkms1 = { pkm11, pkm12, pkm13 };
	    player1.setPokemons(pkms1);

	    Player player2 = new Player("Player Two");
	    Random random = new Random();
	    int number = random.nextInt(3);
	    
	    String name;
	    switch(number) {
	      case 0:
	      	name = "Sessor";
	      	break;
	      case 1:
	      	name = "Paper";
	      	break;
	      case 2:
	      	name = "Stone";
	      	break;
	      default:
	      	name = "null";
	      	break;
	    }
	    Type type;
	    if(name.equals("Sessor")) {
	    	type = Type.Sessor;
	    } else if(name.equals("Paper")) {
	    	type = Type.Paper;
	    } else if(name.equals("Stone")) {
	    	type = Type.Stone;
	    }
	    
	    TypeName pkm0 = new TypeName(name, type);

	    TypeName[] pkms99 = { pkm0,pkm0, pkm0 };
	    player2.setPokemons(pkms99);

	    Game.fight(player1, player2);

	}

}
