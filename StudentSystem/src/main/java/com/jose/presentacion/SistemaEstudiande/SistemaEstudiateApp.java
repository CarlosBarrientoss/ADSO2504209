package com.jose.presentacion.SistemaEstudiande;

import com.jose.Dao.StudentDAO;

import java.util.Scanner;

public class SistemaEstudiateApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();

        boolean exit = false;

        while (!exit){
            showMenu();
            exit = executeOption(consola, studentDAO);
        }

    }

    private static void showMenu(){
        System.out.println("""
        **** Student List ****
        [1] Listar Estudiante
        [2] Buscar Estudiante
        [3] Agregar Estudiante
        [4] Modificar Estudiante
        [5] Eliminar Estudiante
        [6] Salir
        
        Selecciona una opcion
                """);
    }

    private boolean executeOption(Scanner consola, StudentDAO studentDAO){

        int option = Integer.parseInt(consola.nextLine());
        boolean exit = false;


        return false;
    }


}
