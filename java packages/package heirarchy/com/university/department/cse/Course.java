package com.university.department.cse;

public class Course {
    private String name;
    private int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public void display() {
        System.out.println("Course Name: " + name);
        System.out.println("Credits: " + credits);
    }
}
