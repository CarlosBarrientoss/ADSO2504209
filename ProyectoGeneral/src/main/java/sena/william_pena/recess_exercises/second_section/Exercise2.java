package sena.william_pena.recess_exercises.second_section;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        boolean isPar;

        System.out.print("Ingrese el valor a verificar: ");
        int num = Integer.parseInt(in.nextLine());

        isPar = num % 2 == 0 ? true : false;

        if (isPar) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado no es par");
        }
    }
}
