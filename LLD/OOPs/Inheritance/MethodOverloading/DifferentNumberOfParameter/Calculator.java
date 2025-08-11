package LLD.OOPs.Inheritance.MethodOverloading.DifferentNumberOfParameter;

public class Calculator {

  // Method with 2 parameters
  public int add(int a, int b) {
    System.out.println("Adding two integers");
    return a + b;
  }

  // Method with 3 parameters
  public int add(int a, int b, int c) {
    System.out.println("Adding three integers");
    return a + b + c;
  }

  // Method with 4 parameters
  public int add(int a, int b, int c, int d) {
    System.out.println("Adding four integers");
    return a + b + c + d;
  }
}
