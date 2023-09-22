package sena.william_pena.recess_exercises.third_section;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de elementos por lado que desea: ");
        int cant_elements = Integer.parseInt(in.nextLine());

        drawSquare(cant_elements);
    }

    public static void drawTopBottom(int cant_elements) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cant_elements; i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }

    public static void drawSides(int cant_element) {
        StringBuilder sb = new StringBuilder("*");
        int n = cant_element - 2;
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        sb.append("*");
        String row = sb.toString();

        for (int i = 0; i < n; i++) {
            System.out.println(row);
        }
    }

    public static void drawSquare(int cant_elements) {
        drawTopBottom(cant_elements);
        drawSides(cant_elements);
        drawTopBottom(cant_elements);
    }
}
