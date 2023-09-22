package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = """
                
                1. Libras
                2. Dolares
                3. Yenes
                Elija la opcion: """;
        double result = 0;

        System.out.print("Ingrese cuantos euros desea convertir: ");
        double euros = Double.parseDouble(in.nextLine());

        System.out.println(menu);
        int option = Integer.parseInt(in.nextLine());

        switch (option) {
            case 1:
                result = euros * 0.86;
                break;
            case 2:
                result = euros * 1.28611;
                break;
            case 3:
                result = euros * 129.852;
                break;
        }

        System.out.println(String.format("El resultado de la conversion es: %.2f", result));
    }
}
