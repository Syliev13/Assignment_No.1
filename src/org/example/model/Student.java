package org.example.model;

import org.example.interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student " + name + ", " + age + " years old");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying at " + university);
    }

    @Override
    public void takeExam() {
        System.out.println(name + " is taking an exam");
    }

    public final void showUniversity() {
        System.out.println("University: " + university);
    }
}