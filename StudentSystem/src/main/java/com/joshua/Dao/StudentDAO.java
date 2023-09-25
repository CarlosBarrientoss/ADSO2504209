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

    public static void main(String[] args) {
        StudentDAO studentsDao = new StudentDAO();
        System.out.println("Listado de estudiantes: ");

        List<Students> students = studentsDao.listar();
        students.forEach(System.out::println);
    }
}