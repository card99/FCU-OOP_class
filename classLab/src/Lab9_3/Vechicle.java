package Lab9_3;

public class Vechicle {
	
  private String mark = "Toyota";
  
	private String model;
  
	// java �����ëغc�l
	
  public Vechicle(String mark, String model) { // �ק� vechicle���e �إ߷s�غc�l
		super();
		this.mark = mark;
		this.model = model;
	}


	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

  
}
