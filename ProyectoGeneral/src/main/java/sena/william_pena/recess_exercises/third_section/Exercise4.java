package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un valor: ");
            double num = Double.parseDouble(in.nextLine());

            if(num > 0) {
                total += num;
            } else if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
        }

        System.out.println("El resultado de la suma de los nùmeros ingresados es: " + total);
    }
}
