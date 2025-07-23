package LLD.OOPs.Polymorphism.RuntimePolymorphism;

public class Bird extends Animal {
  @Override
  public void makeSound() {
    System.out.println("The bird chirps: Tweet! Tweet!");
  }

  @Override
  public void move() {
    System.out.println("The bird flies in the sky");
  }
}
