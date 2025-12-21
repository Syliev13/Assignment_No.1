package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input for Human object
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is male? (true/false): ");
        boolean isMale = scanner.nextBoolean();

        Human human = new Human(age, name, isMale);

        // Employee object
        Employee employee = new Employee(30, "Matvey", true, "Developer", 2500.5f);

        // Student object
        Student student = new Student(20, "Akerke", false, "Computer Science", 3.7f);

        // Using getters, setters and methods
        human.introduce();
        System.out.println("Role: " + human.getRole());

        employee.introduce();
        System.out.println("Role: " + employee.getRole());
        System.out.println("Company: " + Employee.companyName);

        student.introduce();
        System.out.println("Role: " + student.getRole());

        // Manipulating data using setters
        student.setGpa(3.9f);
        System.out.println("Updated GPA: " + student.getGpa());
    }
}