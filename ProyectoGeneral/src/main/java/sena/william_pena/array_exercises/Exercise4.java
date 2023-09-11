package sena.william_pena.array_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double totalAddition = 0;

        System.out.print("¡Cuantos valores ingresará?: ");
        int quan_numbers = Integer.parseInt(in.nextLine());

        for (int i = 0; i < quan_numbers; i++) {
            int position = i + 1;
            System.out.print(String.format("Ingrese el valor numero %d: ", position));
            double number = Double.parseDouble(in.nextLine());
            numbers.add(number);
        }

        for (Double number : numbers) {
            totalAddition += number;
        }

        System.out.println(String.format("El resultado de la suma de los valores ingresados es: %.2f", totalAddition));
    }
}
