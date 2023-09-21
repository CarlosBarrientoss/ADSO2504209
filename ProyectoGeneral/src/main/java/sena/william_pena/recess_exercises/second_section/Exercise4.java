package sena.william_pena.recess_exercises.second_section;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String sentence = in.nextLine();

        if (sentence.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
