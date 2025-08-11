package LLD.OOPs.Inheritance.MethodOverloading.ConstructorOverloading;

public class Employee {
  private String name;
  private int id;
  private double salary;
  private String department;

  // Constructor overloading
  public Employee() {
    this.name = "Unknown";
    this.id = 0;
    this.salary = 0.0;
    this.department = "Not Assigned";
  }

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
    this.salary = 0.0;
    this.department = "Not Assigned";
  }

  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.department = "Not Assigned";
  }

  public Employee(String name, int id, double salary, String department) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.department = department;
  }

  // Method overloading for displaying information
  public void displayInfo() {
    System.out.println("Employee: " + name);
  }

  public void displayInfo(boolean detailed) {
    if (detailed) {
      System.out.println("ID: " + id + ", Name: " + name +
          ", Salary: $" + salary + ", Department: " + department);
    } else {
      displayInfo(); // Call the simpler version
    }
  }

  public void displayInfo(String format) {
    if (format.equalsIgnoreCase("short")) {
      System.out.println(name + " (" + id + ")");
    } else if (format.equalsIgnoreCase("full")) {
      displayInfo(true);
    } else {
      displayInfo();
    }
  }

  // Method overloading for salary calculation
  public double calculateSalary() {
    return salary;
  }

  public double calculateSalary(double bonus) {
    return salary + bonus;
  }

  public double calculateSalary(double bonus, double deduction) {
    return salary + bonus - deduction;
  }

  public double calculateSalary(int months) {
    return salary * months;
  }

  public double calculateSalary(int months, double bonus) {
    return (salary * months) + bonus;
  }
}
