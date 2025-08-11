package LLD.OOPs;

import LLD.OOPs.ClassAndObject.Car;
import LLD.OOPs.Encapsulation.Student;

public class Main {
  public static void main(String[] args) {
    // Creating objects (instances) of the Car class
    Car car1 = new Car("Toyota", "Camry", 2022);
    Car car2 = new Car("Honda", "Civic", 2021);

    // Using the objects
    car1.displayInfo(); // Output: Toyota Camry (2022)
    car1.start(); // Output: The car is starting...

    car2.displayInfo(); // Output: Honda Civic (2021)
    car2.start(); // Output: The car is starting...

    Student student = new Student("John Doe", 20, 3.5);

    // Accessing data through public methods
    System.out.println("Student name: " + student.getName());

    // Modifying data through setters (with validation)
    student.setAge(25); // Valid
    student.setGpa(5.0); // Invalid - will print error message

    // This would cause a compile error - direct access to private field
    // student.age = 30; // ERROR!

    student.displayInfo();
  }
}
