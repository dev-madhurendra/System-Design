package LLD.OOPs.Inheritance.HierarchicalInheritence;

class Shape {
  protected String color;

  public void draw() {
    System.out.println("Drawing a shape");
  }
}

class Circle extends Shape {
  public void drawCircle() {
    System.out.println("Drawing a circle");
  }
}

class Rectangle extends Shape {
  public void drawRectangle() {
    System.out.println("Drawing a rectangle");
  }
}

class Triangle extends Shape {
  public void drawTriangle() {
    System.out.println("Drawing a triangle");
  }
}

public class HierarchicalInheritence {

}
