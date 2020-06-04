package Lab8_1;

public class Cat extends Animal {

//	@Override
//	public void bark() {
//		// TODO Auto-generated method stub
//		//super.bark();
//		System.out.println("meow");
//	}
  public void useParentPrivateVariable () {
    System.out.println(super.name);
  }
  
  public void run() {
    System.out.println("Animal can run.");
  }


}
