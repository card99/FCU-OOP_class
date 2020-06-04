package Lab8_1;

public class Main {

  public static void main(String[] args) {
    Cat cat = new Cat();
      cat.run();
      cat.useParentPrivateVariable();
      //cat.bark();
    
    Dog dog = new Dog();
      dog.run();
      //dog.bark();

     
    Cow cow = new Cow();
      cow.run();
      //cow.bark();

  	
//    Toy toy = new Toy();
//
//    Animal cat = new Cat();
//    toy.pressButton(cat);
//        
//    Animal dog = new Dog();
//    toy.pressButton(dog);
//           
//    Animal cow = new Cow();
//    toy.pressButton(cow);
        
  }

}
