package sena.william_pena.recess_exercises.second_section;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int greatest;

        for (int i = 0; i < 2; i++) {
            System.out.print(String.format("Ingrese el valor entero numero %d: ", (i + 1)));
            nums.add(Integer.parseInt(in.nextLine()));
        }

        if (nums.get(0) > nums.get(1)) {
            greatest = nums.get(0);
        } else {
            greatest = nums.get(1);
        }

        System.out.println(String.format("El numero mayor es: %d", greatest));
    }
}
