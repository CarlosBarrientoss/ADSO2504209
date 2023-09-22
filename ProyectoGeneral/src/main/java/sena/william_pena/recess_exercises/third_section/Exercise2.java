package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        double total = 0;

        System.out.print("Ingrese el valor limite: ");
        double limite = Double.parseDouble(in.nextLine());

        do {
            System.out.print("Ingrese un valor: ");
            double num = Double.parseDouble(in.nextLine());

            total += num;
        } while (total < limite);
    }
}
