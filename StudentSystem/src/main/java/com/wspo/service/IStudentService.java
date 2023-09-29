package com.wspo.service;

import com.wspo.domain.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> list();
    Student getStudentById(int id);
    int addStudent(Student student);
    boolean searchStudentById(int id);
    boolean deleteStudentById(int id);
    boolean updateStudent(Student student);
}
