
public class Student {
  private String name;
  private int year;
  
  public Student() {
  	System.out.println("Empty");
  }
  
  public Student(String name) {
  	this.name = name;
  	//his.year = year;
  }
  
  public void setYear(int year) {
  	if(year > 0 && year <5) {
  		this.year = year;
  	}
  	
  }
	public int getYear() {
		return this.year;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return this.name;
	}
	
	public void printName() {
		System.out.println(name);
	}
}
