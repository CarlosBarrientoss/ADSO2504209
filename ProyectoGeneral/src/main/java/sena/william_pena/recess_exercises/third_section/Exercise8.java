package sena.william_pena.recess_exercises.third_section;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un valor: ");
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        System.out.println("");

        for (Integer num : nums) {
            String numStr = String.valueOf(num);
            StringBuilder sb = new StringBuilder(num + " ");

            for (int i = 0; i < num; i++) {
                sb.append("*");
            }

            System.out.println(sb.toString());
        }
    }
}
