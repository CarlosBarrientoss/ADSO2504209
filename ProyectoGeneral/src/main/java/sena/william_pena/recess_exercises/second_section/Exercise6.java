package sena.william_pena.recess_exercises.second_section;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el tipo de motor: ");
        int tipoMotor = Integer.parseInt(in.nextLine());

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
