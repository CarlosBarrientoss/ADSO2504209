package sena.william_pena.recess_exercises.second_section;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String sentence = "eureka";

        System.out.print("Ingrese una frase a verificar: ");
        String sentenceToVerify = in.nextLine();

        if (sentenceToVerify.equals(sentence)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
