package sena.william_pena.recess_exercises.second_section;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la frase a verificar: ");
        String sentence = in.nextLine();

        if (sentence.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
