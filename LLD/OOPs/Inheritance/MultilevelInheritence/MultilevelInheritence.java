package LLD.OOPs.Inheritance.MultilevelInheritence;

class Vehicle {
  protected String brand;

  public void start() {
    System.out.println("Vehicle is starting");
  }
}

class Car extends Vehicle {
  protected int doors;

  public void drive() {
    System.out.println("Car is driving");
  }
}

class SportsCar extends Car {
  private int topSpeed;

  public void turboBoost() {
    System.out.println("Turbo boost activated!");
  }
}

public class MultilevelInheritence {

}
