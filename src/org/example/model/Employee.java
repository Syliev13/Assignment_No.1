package org.example.model;

import org.example.interfaces.IStudy;
import org.example.interfaces.IWork;

public class Employee extends Human implements IWork, IStudy {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm employee " + name + ", " + age + " years old");
    }

    @Override
    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is learning new skills");
    }

    @Override
    public void takeExam() {
        System.out.println(name + " passed a certification exam");
    }
}