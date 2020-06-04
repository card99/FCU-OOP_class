package Lab9_3;

public class Vechicle {
	
  private String mark = "Toyota";
  
	private String model;
  
	// java 有隱藏建構子
	
  public Vechicle(String mark, String model) { // 修改 vechicle內容 建立新建構子
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
