package LLD.OOPs.Inheritance.MethodOverloading.WithVargsOverloading;

public class VarArgsExample {

  // Regular overloaded methods
  public void print(int value) {
    System.out.println("Single integer: " + value);
  }

  public void print(int a, int b) {
    System.out.println("Two integers: " + a + ", " + b);
  }

  // Varargs method - can accept any number of integers
  public void print(int... values) {
    System.out.print("Multiple integers: ");
    for (int value : values) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

  // Varargs with other parameters (must be last)
  public void print(String message, int... values) {
    System.out.print(message + ": ");
    for (int value : values) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
}
