package week08;

public class Pikachu {
	private String name;
	private int cp;
	private int hp;
	
	public Pikachu(String name, int cp, int hp) {
		super();
		this.name = name;
		this.cp = cp;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	
}
