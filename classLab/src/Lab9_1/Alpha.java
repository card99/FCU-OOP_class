package Lab9_1;

public class Alpha {
  
	public void sayHello(String name) {  //修改此處 public / prorected / 無  /private
  	System.out.println("Hello Alpha " + name);
  }
  
  public void sayHello() {
  	this.sayHello("OOP");
	}
}
