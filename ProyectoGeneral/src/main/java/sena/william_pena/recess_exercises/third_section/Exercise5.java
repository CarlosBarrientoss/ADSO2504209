package sena.william_pena.recess_exercises.third_section;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = "";
        ArrayList<String> correctas = new ArrayList<>();
        ArrayList<String> incorrectas = new ArrayList<>();

        do {
            System.out.print("Ingrese una cadena: ");
            sentence = in.nextLine();

            if (sentence.length() <= 5
                    && sentence.substring(0, 1).equals("X")
                    && sentence.substring(sentence.length() - 1).equals("O")) {
                correctas.add(sentence);
            } else {
                if (!sentence.equals("&&&&&")) {
                    incorrectas.add(sentence);
                }
            }
        } while (!sentence.equals("&&&&&"));

        System.out.println(String.format("La cantidad de cadenas correctas son: %d", correctas.size()));
        System.out.println(String.format("La cantidad de cadenas incorrectas son: %d", incorrectas.size()));
    }
}
