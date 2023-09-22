package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        double grade = 0;
        boolean keep = true;

        do {
            System.out.print("Ingrese una calificación: ");
            grade = Double.parseDouble(in.nextLine());

            if (grade > 0 && grade < 10) {
                keep = false;
            }
        } while (keep);
    }
}
