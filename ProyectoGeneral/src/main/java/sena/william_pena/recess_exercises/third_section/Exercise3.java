package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = """
                MENU
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Elija opción: """;
        int option = 0;
        double result;

        do {
            System.out.print("Ingresar el primer valor: ");
            double num1 = Double.parseDouble(in.nextLine());

            System.out.print("Ingresar el segundo valor: ");
            double num2 = Double.parseDouble(in.nextLine());
            System.out.println("");

            System.out.print(menu);
            option = Integer.parseInt(in.nextLine());

            switch (option) {
                case 1:
                    result = num1 + num2;
                    showResult(result);
                    break;
                case 2:
                    result = num1 - num2;
                    showResult(result);
                    break;
                case 3:
                    result = num1 * num2;
                    showResult(result);
                    break;
                case 4:
                    result = num1 / num2;
                    showResult(result);
                    break;
                case 5:
                    System.out.println("Esta seguro de desea salir del programa (S/N)");
                    String input = in.nextLine();
                    boolean exit = input.equals("S") || input.equals("s") ? true : false;

                    if (exit){
                        option = 5;
                    }
                    break;
            }
        } while (option != 5);

    }

    public static void showResult(double result) {
        System.out.println(String.format("El resultado de la operacion es: %.2f\n", result));
    }
}
