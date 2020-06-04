package midd;

public class Player {
	  private String playerName;
	  private TypeName[] typenames;
	  private int level;
	  //屬性值只能被類別內的建構子或方法使用

	  public Player(String playerName) {
	    this.playerName = playerName;
	    this.level = 1;
	  }
	  
	  public String getPlayerName() {
	    return playerName;
	  }

	  public void setPlayerName(String playerName) {
	    this.playerName = playerName;
	  }

	  public TypeName[] getTypeNames() {
	    return typenames;
	  }

	  public void setPokemons(TypeName[] typeNames) {
	    this.typenames = typeNames;
	  }

	  public int getLevel() {
	    return level;
	  }

	  public void setLevel(int level) {
	    this.level = level;
	  }
}

