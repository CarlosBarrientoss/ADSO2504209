package com.joshua.Dao;

import com.joshua.domain.Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.joshua.connection.ConnectionDB.getConnectionDB;

public class StudentDAO {

    public List<Students> listar(){
        List<Students> students= new ArrayList<>();

        PreparedStatement ps; // Encapsula la conexión.
        ResultSet rs; // Guarda la conexión.
        Connection con = getConnectionDB(); // Trae la conexión.
        String sql = "SELECT * FROM student ORDER BY id_student";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                Students student = new Students();
                student.setId_student(rs.getInt("id_student"));
                student.setName(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                student.setPhone(rs.getString("phone"));
                student.setEmail(rs.getString("email"));
                students.add(student);


            }
        } catch (Exception ex){
            System.out.println("Error en la consulta " + ex.getMessage());
        }finally {
            try {
                con.close();
            } catch (Exception ex){
                System.out.println("Error al cerrar la conexión " + ex.getMessage());
            }
        }


        return students;
    }

    public boolean searchStudentById(Students students){

        PreparedStatement ps;
        ResultSet rs;

        // Creamos la conexión.
        Connection con = getConnectionDB();
        String sql = "SELECT FROM student WHERE id_student = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, students.getId_student());
            rs = ps.executeQuery();

            while (rs.next()){
                students.setName(rs.getString("first_name"));
                students.setLast_name(rs.getString("last_name"));
                students.setPhone(rs.getString("phone"));
                students.setEmail(rs.getString("email"));

                return true;
            }
        } catch (Exception ex){
            System.out.println("Ocurrio un error " + ex.getMessage());
        } finally {
            try{
                con.close();
            }catch (Exception ex){
                System.out.println("Ocurre un error mientras se intenta cerrar la conexión " + ex.getMessage());
            }
        }


        return false;
    }

    public boolean addStudent(Students students){

        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnectionDB();
        String sql = "INSERT INTO student(first_name, last_name, phone, email)" + "VALUE(?,?,?,?)";

        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,students.getName());
            ps.setString(2,students.getLast_name());
            ps.setString(3, students.getPhone());
            ps.setString(4, students.getEmail());
            ps.execute();
        } catch (Exception ex){
            System.out.println("Ocurrio un error" + ex.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception ex){
                System.out.println("Ocurrio un error mientras se intentaba cerrar la conexión" + ex.getMessage());
            }
        }

        return false;
    }

    public boolean updateStudent(Students students){

        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnectionDB();
        String sql = "UPDATE student SET first_name = ?, last_name = ?, phone = ?, email = ? WHERE id_student = ?";

        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,students.getName());
            ps.setString(2,students.getLast_name());
            ps.setString(3, students.getPhone());
            ps.setString(4, students.getEmail());
            ps.execute();

            return true;

        } catch (Exception ex){
            System.out.println("Ocurrio un error" + ex.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception ex){
                System.out.println("Ocurrio un error mientras se intentaba cerrar la conexión" + ex.getMessage());
            }
        }
        return false;
    }

    public boolean deleteStudent(Students students){
        PreparedStatement ps;
        Connection con = getConnectionDB();
        String sql = "DELETE FROM student WHERE id_student = ?";

        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,students.getId_student());

            ps.execute();
            return true;

        } catch (Exception ex){
            System.out.println("Ocurrio un error" + ex.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception ex){
                System.out.println("Ocurrio un error mientras se intentaba cerrar la conexión" + ex.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StudentDAO studentsDao = new StudentDAO();


        // ADD STUDENT
        System.out.println("Add new student");
        Students objectStudent2 = new Students("Rodrigo","Alvarez","31213131123","rodrigo@gmail.com");
        boolean objectUpdate = studentsDao.addStudent(objectStudent2);
        if (objectUpdate){
            System.out.println("Student ADD" + objectStudent2);
        } else {
            System.out.println("Student no ADD " + objectStudent2);
        }

        //LIST STUDENTS
        System.out.println("Listado de estudiantes: ");

        List<Students> students = studentsDao.listar();
        students.forEach(System.out::println);



        //UPDATE STUDENT
        Students objectStudent3 = new Students("Pedro", "Quinetro", "3209458934","pedro@gmail.com");
        boolean objectStudent4 = studentsDao.updateStudent(objectStudent3);
        if (objectStudent4){
            System.out.println("Student update OK" + objectStudent3);
        } else {
            System.out.println("Student no update BAD" + objectStudent3);
        }


        // LIST STUDENT AGAIN
        System.out.println("Nuevo Listado de estudiantes");
        List<Students> students1 = studentsDao.listar();
        students1.forEach(System.out::println);



        // SEARCH BY ID
        Students objectStudent = new Students(2);
        boolean foundObject = studentsDao.searchStudentById(objectStudent);
        if (foundObject){
            System.out.println("Student found: " + objectStudent);
        } else {
            System.out.println("No found "+ objectStudent);
        }

        System.out.println();

        //DELETE STUDENT
        Students objectStudent5 = new Students(3);
        boolean objectDelete = studentsDao.deleteStudent(objectStudent5);
        if (objectDelete){
            System.out.println("Student delete OK" + objectStudent5);
        }else {
            System.out.println("Student delete NO" + objectStudent5);

        }

    }
}