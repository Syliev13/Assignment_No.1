package org.example;

public class Student extends Human {

    private String major;
    private float gpa;

    public Student(int age, String name, boolean isMale, String major, float gpa) {
        super(age, name, isMale);
        this.major = major;
        this.gpa = gpa;
    }

    // Getters & Setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // Overridden method
    @Override
    public String getRole() {
        return "Student";
    }
}
