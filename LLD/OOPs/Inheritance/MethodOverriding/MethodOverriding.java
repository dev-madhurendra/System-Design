package LLD.OOPs.Inheritance.MethodOverriding;

class Bird {
  public void fly() {
    System.out.println("Bird is flying");
  }

  public void makeSound() {
    System.out.println("Bird makes a sound");
  }
}

class Eagle extends Bird {
  @Override
  public void fly() {
    System.out.println("Eagle soars high in the sky");
  }

  @Override
  public void makeSound() {
    System.out.println("Eagle screeches");
  }
}

class Penguin extends Bird {
  @Override
  public void fly() {
    System.out.println("Penguins can't fly, but they swim!");
  }
}

public class MethodOverriding {

}
