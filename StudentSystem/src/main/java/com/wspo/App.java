package com.wspo;

import com.wspo.dao.StudentDao;
import com.wspo.domain.Student;
import com.wspo.factory.ConnectionFactory;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        StudentDao studentDao = new StudentDao(connectionFactory);
        Student student;

        System.out.println("List of Students \n");
        ArrayList<Student> students = studentDao.list();
        students.forEach(System.out::println);

        System.out.println("\nGetting student by id 2 \n");
        student = studentDao.getStudentById(2);
        System.out.println(student);
    }
}
