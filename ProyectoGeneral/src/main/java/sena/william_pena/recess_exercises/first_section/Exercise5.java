package sena.william_pena.recess_exercises.first_section;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String responseTemplate = """
                Doble: %d
                Triple: %d
                Raíz cuadrada: %.2f
                """;

        System.out.print("Ingrese el número entero con el que se realizaran las operaciones: ");
        int num = Integer.parseInt(in.nextLine());

        int doubleResult = num * 2;
        int tripleResult = num * 3;
        double sqrtResult = Math.sqrt(num);

        System.out.println(String.format(responseTemplate, doubleResult, tripleResult, sqrtResult));
    }
}
