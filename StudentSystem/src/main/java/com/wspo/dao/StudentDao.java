package com.wspo.dao;

import com.wspo.domain.Student;
import com.wspo.factory.ConnectionFactory;
import com.wspo.service.IStudentService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

public class StudentDao implements IStudentService {

    private ConnectionFactory connectionFactory;

    public StudentDao(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
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

    @Override
    public Optional<Student> getStudentById(int id) {
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
            student.setNameStudent(rs.getString("nameStudent"));
            student.setLastName(rs.getString("lastNameStudent"));
            student.setPhoneNumber(rs.getString("phoneNumber"));
            student.setEmail(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.of(student);
    }

    @Override
    public int addStudent(Student student) {
        String query = """
                INSERT INTO student (nameStudent, lastNameStudent, phoneNumber, email) VALUE
                (?,?,?,?)
                """;
        PreparedStatement ps;
        int id = 0;
        Connection conn = this.connectionFactory.getConnection();
        ResultSet rs;

        try (conn) {
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, student.getNameStudent());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getPhoneNumber());
            ps.setString(4, student.getEmail());
            ps.execute();
            rs = ps.getGeneratedKeys();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public boolean searchStudentById(int id) {
        Student student = new Student();
        String query = "SELECT * FROM student WHERE idStudent = ?;";
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = this.connectionFactory.getConnection();
        boolean found = false;

        try (conn) {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                student.setIdStudent(rs.getInt("idStudent"));
                student.setNameStudent(rs.getString("nameStudent"));
                student.setLastName(rs.getString("lastNameStudent"));
                student.setPhoneNumber(rs.getString("phoneNumber"));
                student.setEmail(rs.getString("email"));
            }

            if (!(student.getNameStudent() == null)) {
                found = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return found;
    }

    @Override
    public boolean deleteStudentById(int id) {
        String query = """
                DELETE FROM student
                WHERE idStudent = ?
                """;
        PreparedStatement ps;
        boolean result = false;
        Connection conn = this.connectionFactory.getConnection();

        try (conn) {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            result = ps.execute();
            if (!result) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
        String query = """
                UPDATE student 
                SET 
                nameStudent = ?,
                lastNameStudent = ?,
                phoneNumber = ?,
                email = ?
                WHERE idStudent = ?
                """;
        PreparedStatement ps;
        boolean result = false;
        Connection conn = this.connectionFactory.getConnection();

        try (conn) {
            ps = conn.prepareStatement(query);
            ps.setString(1, student.getNameStudent());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getPhoneNumber());
            ps.setString(4, student.getEmail());
            ps.setInt(5, student.getIdStudent());
            result = ps.execute();
            if (!result) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
