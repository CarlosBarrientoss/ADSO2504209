package sena.william_pena.matrix_exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] matrix = new String[2][2];
        ArrayList<String> strings = new ArrayList<>();
        String startsWithLetterRegex = "^[A-Za-z]+";
        String vowelRegex = "[aeiouAEIOU]";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("Ingrese la cadena de texto de la posicion [%d][%d]: ", i, j));
                matrix[i][j] = in.nextLine();
            }
        }
        System.out.println("");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String word = matrix[i][j];
                String[] charactersArray = word.strip().split("");
                int vowelQuantity = 0;

                for (String character : charactersArray) {
                    if (character.matches(vowelRegex)) {
                        vowelQuantity++;
                    }
                }

                if (word.length() >= 5 && word.matches(startsWithLetterRegex) && vowelQuantity >= 3) {
                    strings.add(word);
                }
            }
        }

        System.out.println("Las cadenas que cumplen con los requisitos dados son:");
        System.out.println(strings);
    }
}
