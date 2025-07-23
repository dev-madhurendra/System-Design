package LLD.OOPs.ClassAndObject;

public class Car {
  // Fields (attributes)
  private String brand;
  private String model;
  private int year;

  // Constructor
  public Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  // Methods (behavior)
  public void start() {
    System.out.println("The car is starting...");
  }

  public void displayInfo() {
    System.out.println(brand + " " + model + " (" + year + ")");
  }

  // Getters and setters
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}
