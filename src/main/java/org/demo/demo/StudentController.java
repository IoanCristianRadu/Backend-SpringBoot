package org.demo.demo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController{
    @CrossOrigin
    @GetMapping("/student")
        public Students student(@RequestParam(required=false, defaultValue="World") String name) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student charlie = new Student("Charlie" , 23);
        Student anne = new Student("Anne" , 21);
        Student marcus = new Student("Marcus" , 22);
        
        studentList.add(charlie);
        studentList.add(anne);
        studentList.add(marcus);

        Students students = new Students(studentList);
        return students;
        }
}