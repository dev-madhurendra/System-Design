package LLD.OOPs.Inheritance.MethodOverloading.DifferentOrderParameter;

public class Display {

  // Method with int first, then String
  public void show(int number, String text) {
    System.out.println("Number: " + number + ", Text: " + text);
  }

  // Method with String first, then int
  public void show(String text, int number) {
    System.out.println("Text: " + text + ", Number: " + number);
  }

  // Method with double and String
  public void show(double value, String text) {
    System.out.println("Value: " + value + ", Text: " + text);
  }
}
