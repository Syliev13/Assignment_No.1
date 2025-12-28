package org.example;

import org.example.interfaces.IStudy;
import org.example.interfaces.IWork;
import org.example.model.Employee;
import org.example.model.Human;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {

        // Создание объектов разными способами (полиморфизм)
        Student student = new Student("Maksat", 19, "AITU");
        Human employeeAsHuman = new Employee("Alikhan", 30, 1200);
        IWork employeeAsWork = new Employee("Turlan", 28, 1500);
        IStudy studentAsStudy = new Student("Akerke", 20, "MUA");

        // Методы Student
        student.introduce();
        student.study();
        student.takeExam();
        student.showUniversity();
        student.sleep();

        System.out.println();

        // Методы Employee через Human
        employeeAsHuman.introduce();
        employeeAsHuman.sleep();

        System.out.println();

        // Методы Employee через интерфейс
        employeeAsWork.work();
        System.out.println("Salary: " + employeeAsWork.getSalary());

        System.out.println();

        // Методы Student через интерфейс
        studentAsStudy.study();
        studentAsStudy.takeExam();
    }
}