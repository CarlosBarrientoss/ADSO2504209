package sena.william_pena.recess_exercises.first_section;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer valor a sumar: ");
        double num1 = Double.parseDouble(in.nextLine());

        System.out.print("Ingrese el segundo valor a sumar: ");
        double num2 = Double.parseDouble(in.nextLine());

        double result = num1 + num2;

        System.out.println(String.format("El resultado de la suma de los valores ingresados es: %.1f", result));
    }
}
