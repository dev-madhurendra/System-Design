package LLD.OOPs.Polymorphism;

import LLD.OOPs.Polymorphism.RuntimePolymorphism.*;

public class PolymorphismDemo {
  public static void main(String[] args) {
    // Polymorphic array - single array holding different object types
    Animal[] animals = {
        new Dog(),
        new Cat(),
        new Bird(),
        new Animal()
    };

    // Polymorphic behavior - same method call, different behaviors
    for (Animal animal : animals) {
      animal.makeSound(); // Calls overridden method based on actual object
      animal.move(); // Calls overridden method based on actual object
      System.out.println("---");
    }

    // Dynamic method dispatch
    Animal myPet;

    myPet = new Dog();
    performAnimalActions(myPet); // Dog's behavior

    myPet = new Cat();
    performAnimalActions(myPet); // Cat's behavior

    myPet = new Bird();
    performAnimalActions(myPet); // Bird's behavior
  }

  // Single method that works with any Animal subclass
  public static void performAnimalActions(Animal animal) {
    System.out.println("Performing actions:");
    animal.makeSound();
    animal.move();
    System.out.println("---");
  }
}
