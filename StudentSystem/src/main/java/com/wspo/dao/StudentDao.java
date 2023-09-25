package com.wspo.dao;

import com.wspo.domain.Student;
import com.wspo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private ConnectionFactory connectionFactory;

    public StudentDao(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public ArrayList<Student> list() {
        ArrayList<Student> students = new ArrayList<>();
        String query = "SELECT * FROM student ORDER BY idStudent ASC;";
        ResultSet rs;
        PreparedStatement ps;
        Connection conn = connectionFactory.getConnection();

        try (conn) {
            ps = conn.prepareStatement(query);
            ps.executeQuery();
            rs = ps.getResultSet();

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("idStudent"),
                        rs.getString("nameStudent"),
                        rs.getString("lastNameStudent"),
                        rs.getString("phoneNumber"),
                        rs.getString("email"));
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }

    public Student getStudentById(int id) {
        Student student = new Student();
        String query = "SELECT * FROM student WHERE idStudent = ?;";
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = this.connectionFactory.getConnection();

        try (conn) {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeQuery();
            rs = ps.getResultSet();
            rs.next();
            student.setIdStudent(rs.getInt("idStudent"));
            student.setName(rs.getString("nameStudent"));
            student.setLastName(rs.getString("lastNameStudent"));
            student.setPhoneNumber(rs.getString("phoneNumber"));
            student.setEmail(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}
