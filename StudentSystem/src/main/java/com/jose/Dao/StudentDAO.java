package com.jose.Dao;

import com.jose.domain.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static com.jose.connection.ConnectionDB.getConnectionDB;

public class StudentDAO {

    public List<Students> listar(){
        List<Students> students = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnectionDB();
        String sql = "SELECT * FROM  student ORDER BY idstudent";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                Students student = new Students();
                student.setId_Student(rs.getInt("idstudent"));
                student.setNombre(rs.getString("firts_name"));
                student.setApellido(rs.getString("last_name"));
                student.setTelefono(rs.getString("phone"));
                student.setEmail(rs.getString("email"));
                students.add(student);
            }

        }catch (Exception ex){
            System.out.println("Ocurrio un error en la consulta" + ex.getMessage() );
        }finally {
            try {
                    con.close();
            }catch (Exception ex){
                System.out.println("Ocurrio un error a");
            }
        }
        return students;


    }

    public boolean searchsStudentByID(Students student){
        PreparedStatement ps;
        ResultSet rs;
        //Crear la conexion
        Connection con = getConnectionDB();
        String sql = "SELECT * FROM student WHERE idstudent = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,student.getId_Student());
            rs = ps.executeQuery();

            while (rs.next()){
                student.setNombre(rs.getString("firts_name"));
                student.setApellido(rs.getString("last_name"));
                student.setTelefono(rs.getString("phone"));
                student.setEmail(rs.getString("email"));
            }
        }catch (Exception ex){
            System.out.println("An error ocurred" + ex.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception ex){
                System.out.println("An error ocurred while tryling" + ex.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {

        StudentDAO studentDao = new StudentDAO();
        System.out.println("Listado de estudiantes");

        List<Students> students = studentDao.listar();
        students.forEach(System.out::println);

        Students objectStudent = new Students(2);
        boolean foundObject = studentDao.searchsStudentByID(objectStudent);
        if (foundObject){
            System.out.println("student found" + objectStudent);
        }else {
            System.out.println("no found" + objectStudent);
        }



    }
}
