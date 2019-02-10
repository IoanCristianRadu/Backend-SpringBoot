package org.demo.demo;

public class Student{
    private final String name;
    private final int age;

    public Student() {
        this.name = "";
        this.age = -1;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }
}