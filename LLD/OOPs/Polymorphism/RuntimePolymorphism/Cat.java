package LLD.OOPs.Polymorphism.RuntimePolymorphism;

public class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("The cat meows: Meow! Meow!");
  }

  @Override
  public void move() {
    System.out.println("The cat walks gracefully");
  }
}
