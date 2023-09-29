package com.joshua;

import com.joshua.Dao.StudentDAO;
import com.joshua.domain.Students;

import java.util.List;
import java.util.Scanner;

public class SystemStudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDAO studentDao = new StudentDAO();

        boolean exit = false;
        while (!exit){
            showMenu();
            excuteOption(sc, studentDao);
        }
    }
    private static void showMenu(){
        System.out.println("""
         ****** Student List ******
         [1] Listar Estudiante
         [2] Buscar Estudiante
         [3] Agregar Estudiante
         [4] Modificar Estudiante
         [5] Eliminar Estudiante
         [6] EXIT
         
         Seleccione una opción ?
                """);
    }

    private boolean excuteOption(Scanner sc, StudentDAO studentsDao){

        int option = sc.nextInt();
        boolean exit = false;

        switch (option){
            case 1 ->{
                System.out.println("Listado de estudiantes: ");

                List<Students> students = studentsDao.listar();
                students.forEach(System.out::println);
            }
            case 2 ->{
                System.out.println("Ingrese el número del ID que quiere encontrar");
                int idStudent = sc.nextInt();
                Students objectStudent = new Students(idStudent);
                boolean foundObject = studentsDao.searchStudentById(objectStudent);
                if (foundObject){
                    System.out.println("Student found: " + objectStudent);
                } else {
                    System.out.println("No found "+ objectStudent);
                }
            }
            case 3 ->{

            }
        }

        return false;
    }

}