package sena.jonathan_avendano.array_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        double average = 0;

        System.out.print("¡Cuantas calificaciones ingresará?: ");
        int quan_grades = Integer.parseInt(in.nextLine());

        for (int i = 0; i < quan_grades; i++) {
            int position = i + 1;
            System.out.print(String.format("Ingrese la calificacion numero %d: ", position));
            double grade = Double.parseDouble(in.nextLine());
            grades.add(grade);
        }

        for (Double grade : grades) {
            average += grade;
        }

        average /= grades.size();

        System.out.println(String.format("El promedio de las calificaciones es: %.2f", average));
    }
}
