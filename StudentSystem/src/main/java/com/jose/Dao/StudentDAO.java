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
        String sql = "SELECT * FROM  student ORDER BY id_Student";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                Students student = new Students();
                student.setId_Student(rs.getInt("id_student"));
                student.setNombre(rs.getString("first_name"));
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

    public static void main(String[] args) {

        StudentDAO studentDao = new StudentDAO();
        System.out.println("Listado de estudiantes");

        List<Students> students = studentDao.listar();
        students.forEach(System.out::println);


    }
}
