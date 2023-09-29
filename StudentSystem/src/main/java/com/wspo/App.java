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

        System.out.println("\nDeleting student by id");
        boolean deleteResult = studentDao.deleteStudentById(10);
        System.out.println(deleteResult);

        System.out.println("\nAdding new Student");
        int idNewStudent = studentDao.addStudent(new Student("Wilila", "peia", "32122", "me@gmail.com"));
        System.out.println(String.format("New Student registered with Id: %d", idNewStudent));

        System.out.println("\nUpdating student with id 2");
        student.setNameStudent("Juan Esteban");
        boolean updateResult = studentDao.updateStudent(student);
        System.out.println(updateResult);
        System.out.println(student);
    }
}
