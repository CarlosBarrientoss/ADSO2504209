package sena.william_pena.recess_exercises.first_section;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese los grados centígrados que desea convertir a Fahrenheit: ");
        double celsius = Double.parseDouble(in.nextLine());

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(String.format("El resultado de la conversión de centígrados a farenheit es: %.2f", fahrenheit));
    }
}
