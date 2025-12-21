package org.example;

public class Human {

    private int age;
    private String name;
    private boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    // Getters & Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    // Common methods
    public void introduce() {
        System.out.println("Hi, my name is " + name);
    }

    public String getRole() {
        return "Human";
    }
}
