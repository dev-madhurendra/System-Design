package LLD.OOPs.Encapsulation;


public class Student {
    // Private fields - data hiding
    private String name;
    private int age;
    private double gpa;
    
    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        setAge(age);  // Using setter for validation
        setGpa(gpa);  // Using setter for validation
    }
    
    // Public getter methods - controlled access to read data
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Public setter methods - controlled access to modify data
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {  // Validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {  // Validation
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0");
        }
    }
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}
