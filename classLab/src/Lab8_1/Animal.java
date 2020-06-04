package Lab8_1;

public class Animal {
  
  protected String name = "My name is animal";

  public void printName() {
    System.out.println(this.name);
  }

  public final void bark() {
    System.out.println("Animal can bark.");
  }
  
//  public abstract void bark();
  
  public void run() {
    System.out.println("Animal can run.");
  }

}
