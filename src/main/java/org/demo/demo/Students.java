package org.demo.demo;

import java.util.ArrayList;

public class Students{
    private ArrayList<Student> students= new ArrayList<Student>();

    public Students() {
        this.students = null;
    }

    public Students(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}