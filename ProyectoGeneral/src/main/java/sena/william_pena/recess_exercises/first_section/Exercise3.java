package sena.william_pena.recess_exercises.first_section;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String sentence = in.nextLine();
        String lowerCaseSentence = sentence.toLowerCase();
        String upperCaseSentence = sentence.toUpperCase();

        System.out.println(String.format("\nLa frase ingresada en 'UpperCase' se vería de la siguiente manera: %s", upperCaseSentence));
        System.out.println(String.format("La frase ingresada en 'LowerCase' se vería de la siguiente manera: %s", lowerCaseSentence));

    }
}
