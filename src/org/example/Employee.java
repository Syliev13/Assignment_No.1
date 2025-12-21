package org.example;

public class Employee extends Human {

    private String position;
    private float salary;

    // static field
    public static String companyName = "TechCorp";

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age, name, isMale);
        this.position = position;
        this.salary = salary;
    }

    // Getters & Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Overridden method
    @Override
    public String getRole() {
        return "Employee";
    }
}