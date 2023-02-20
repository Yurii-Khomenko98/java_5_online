package ua.com.alevel;

//import ua.com.alevel.entity.Student;

import ua.com.alevel.controller.StudentController;

import java.io.IOException;
import java.util.UUID;

public class StartOOP {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello StartOOP!");
//
//        Student student = new Student();
//        int age = student.getAge();
//        System.out.println("age = " + age);
//        student.setAge(35);
//        age = student.getAge();
//        System.out.println("age = " + age);
//        System.out.println("id = " + student.getId());
        StudentController studentController = new StudentController();
        studentController.start();
    }

}